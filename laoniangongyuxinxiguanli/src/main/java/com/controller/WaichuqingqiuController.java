
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 外出请求
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/waichuqingqiu")
public class WaichuqingqiuController {
    private static final Logger logger = LoggerFactory.getLogger(WaichuqingqiuController.class);

    @Autowired
    private WaichuqingqiuService waichuqingqiuService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YonghuService yonghuService;

    @Autowired
    private HugongService hugongService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("老人".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("护工".equals(role))
            params.put("hugongId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = waichuqingqiuService.queryPage(params);

        //字典表数据转换
        List<WaichuqingqiuView> list =(List<WaichuqingqiuView>)page.getList();
        for(WaichuqingqiuView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        WaichuqingqiuEntity waichuqingqiu = waichuqingqiuService.selectById(id);
        if(waichuqingqiu !=null){
            //entity转view
            WaichuqingqiuView view = new WaichuqingqiuView();
            BeanUtils.copyProperties( waichuqingqiu , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(waichuqingqiu.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody WaichuqingqiuEntity waichuqingqiu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,waichuqingqiu:{}",this.getClass().getName(),waichuqingqiu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("老人".equals(role))
            waichuqingqiu.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<WaichuqingqiuEntity> queryWrapper = new EntityWrapper<WaichuqingqiuEntity>()
            .eq("yonghu_id", waichuqingqiu.getYonghuId())
            .eq("waichuqingqiu_text", waichuqingqiu.getWaichuqingqiuText())
            .eq("waichuqingqiu_shijian", waichuqingqiu.getWaichuqingqiuShijian())
            .eq("waichuqingqiu_yesno_types", waichuqingqiu.getWaichuqingqiuYesnoTypes())
            .eq("waichuqingqiu_yesno_text", waichuqingqiu.getWaichuqingqiuYesnoText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        WaichuqingqiuEntity waichuqingqiuEntity = waichuqingqiuService.selectOne(queryWrapper);
        if(waichuqingqiuEntity==null){
            waichuqingqiu.setWaichuqingqiuYesnoTypes(1);
            waichuqingqiu.setCreateTime(new Date());
            waichuqingqiuService.insert(waichuqingqiu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody WaichuqingqiuEntity waichuqingqiu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,waichuqingqiu:{}",this.getClass().getName(),waichuqingqiu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("老人".equals(role))
//            waichuqingqiu.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<WaichuqingqiuEntity> queryWrapper = new EntityWrapper<WaichuqingqiuEntity>()
            .notIn("id",waichuqingqiu.getId())
            .andNew()
            .eq("yonghu_id", waichuqingqiu.getYonghuId())
            .eq("waichuqingqiu_text", waichuqingqiu.getWaichuqingqiuText())
            .eq("waichuqingqiu_shijian", waichuqingqiu.getWaichuqingqiuShijian())
            .eq("waichuqingqiu_time", waichuqingqiu.getWaichuqingqiuTime())
            .eq("waichuqingqiu_yesno_types", waichuqingqiu.getWaichuqingqiuYesnoTypes())
            .eq("waichuqingqiu_yesno_text", waichuqingqiu.getWaichuqingqiuYesnoText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        WaichuqingqiuEntity waichuqingqiuEntity = waichuqingqiuService.selectOne(queryWrapper);
        if(waichuqingqiuEntity==null){
            waichuqingqiuService.updateById(waichuqingqiu);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        waichuqingqiuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<WaichuqingqiuEntity> waichuqingqiuList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            WaichuqingqiuEntity waichuqingqiuEntity = new WaichuqingqiuEntity();
//                            waichuqingqiuEntity.setYonghuId(Integer.valueOf(data.get(0)));   //申请人 要改的
//                            waichuqingqiuEntity.setWaichuqingqiuText(data.get(0));                    //外出原因 要改的
//                            waichuqingqiuEntity.setWaichuqingqiuShijian(data.get(0));                    //外出时间 要改的
//                            waichuqingqiuEntity.setWaichuqingqiuTime(new Date(data.get(0)));          //申请时间 要改的
//                            waichuqingqiuEntity.setWaichuqingqiuYesnoTypes(Integer.valueOf(data.get(0)));   //审核结果 要改的
//                            waichuqingqiuEntity.setWaichuqingqiuYesnoText(data.get(0));                    //审核原因 要改的
//                            waichuqingqiuEntity.setCreateTime(date);//时间
                            waichuqingqiuList.add(waichuqingqiuEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        waichuqingqiuService.insertBatch(waichuqingqiuList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
