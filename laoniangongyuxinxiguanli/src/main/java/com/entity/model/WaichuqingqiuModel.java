package com.entity.model;

import com.entity.WaichuqingqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 外出请求
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WaichuqingqiuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 申请人
     */
    private Integer yonghuId;


    /**
     * 外出原因
     */
    private String waichuqingqiuText;


    /**
     * 外出时间
     */
    private String waichuqingqiuShijian;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date waichuqingqiuTime;


    /**
     * 审核结果
     */
    private Integer waichuqingqiuYesnoTypes;


    /**
     * 审核原因
     */
    private String waichuqingqiuYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：申请人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：申请人
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：外出原因
	 */
    public String getWaichuqingqiuText() {
        return waichuqingqiuText;
    }


    /**
	 * 设置：外出原因
	 */
    public void setWaichuqingqiuText(String waichuqingqiuText) {
        this.waichuqingqiuText = waichuqingqiuText;
    }
    /**
	 * 获取：外出时间
	 */
    public String getWaichuqingqiuShijian() {
        return waichuqingqiuShijian;
    }


    /**
	 * 设置：外出时间
	 */
    public void setWaichuqingqiuShijian(String waichuqingqiuShijian) {
        this.waichuqingqiuShijian = waichuqingqiuShijian;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getWaichuqingqiuTime() {
        return waichuqingqiuTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setWaichuqingqiuTime(Date waichuqingqiuTime) {
        this.waichuqingqiuTime = waichuqingqiuTime;
    }
    /**
	 * 获取：审核结果
	 */
    public Integer getWaichuqingqiuYesnoTypes() {
        return waichuqingqiuYesnoTypes;
    }


    /**
	 * 设置：审核结果
	 */
    public void setWaichuqingqiuYesnoTypes(Integer waichuqingqiuYesnoTypes) {
        this.waichuqingqiuYesnoTypes = waichuqingqiuYesnoTypes;
    }
    /**
	 * 获取：审核原因
	 */
    public String getWaichuqingqiuYesnoText() {
        return waichuqingqiuYesnoText;
    }


    /**
	 * 设置：审核原因
	 */
    public void setWaichuqingqiuYesnoText(String waichuqingqiuYesnoText) {
        this.waichuqingqiuYesnoText = waichuqingqiuYesnoText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
