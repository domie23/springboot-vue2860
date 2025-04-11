package com.dao;

import com.entity.WaichuqingqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WaichuqingqiuView;

/**
 * 外出请求 Dao 接口
 *
 * @author 
 */
public interface WaichuqingqiuDao extends BaseMapper<WaichuqingqiuEntity> {

   List<WaichuqingqiuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
