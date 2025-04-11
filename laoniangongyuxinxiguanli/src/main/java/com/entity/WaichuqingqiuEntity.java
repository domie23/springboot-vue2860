package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 外出请求
 *
 * @author 
 * @email
 */
@TableName("waichuqingqiu")
public class WaichuqingqiuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WaichuqingqiuEntity() {

	}

	public WaichuqingqiuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 申请人
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 外出原因
     */
    @TableField(value = "waichuqingqiu_text")

    private String waichuqingqiuText;


    /**
     * 外出时间
     */
    @TableField(value = "waichuqingqiu_shijian")

    private String waichuqingqiuShijian;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "waichuqingqiu_time")

    private Date waichuqingqiuTime;


    /**
     * 审核结果
     */
    @TableField(value = "waichuqingqiu_yesno_types")

    private Integer waichuqingqiuYesnoTypes;


    /**
     * 审核原因
     */
    @TableField(value = "waichuqingqiu_yesno_text")

    private String waichuqingqiuYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：申请人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：申请人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：外出原因
	 */
    public String getWaichuqingqiuText() {
        return waichuqingqiuText;
    }


    /**
	 * 获取：外出原因
	 */

    public void setWaichuqingqiuText(String waichuqingqiuText) {
        this.waichuqingqiuText = waichuqingqiuText;
    }
    /**
	 * 设置：外出时间
	 */
    public String getWaichuqingqiuShijian() {
        return waichuqingqiuShijian;
    }


    /**
	 * 获取：外出时间
	 */

    public void setWaichuqingqiuShijian(String waichuqingqiuShijian) {
        this.waichuqingqiuShijian = waichuqingqiuShijian;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getWaichuqingqiuTime() {
        return waichuqingqiuTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setWaichuqingqiuTime(Date waichuqingqiuTime) {
        this.waichuqingqiuTime = waichuqingqiuTime;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getWaichuqingqiuYesnoTypes() {
        return waichuqingqiuYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setWaichuqingqiuYesnoTypes(Integer waichuqingqiuYesnoTypes) {
        this.waichuqingqiuYesnoTypes = waichuqingqiuYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getWaichuqingqiuYesnoText() {
        return waichuqingqiuYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setWaichuqingqiuYesnoText(String waichuqingqiuYesnoText) {
        this.waichuqingqiuYesnoText = waichuqingqiuYesnoText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Waichuqingqiu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", waichuqingqiuText=" + waichuqingqiuText +
            ", waichuqingqiuShijian=" + waichuqingqiuShijian +
            ", waichuqingqiuTime=" + waichuqingqiuTime +
            ", waichuqingqiuYesnoTypes=" + waichuqingqiuYesnoTypes +
            ", waichuqingqiuYesnoText=" + waichuqingqiuYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
