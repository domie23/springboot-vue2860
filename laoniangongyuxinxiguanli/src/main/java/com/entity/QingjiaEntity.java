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
 * 请假
 *
 * @author 
 * @email
 */
@TableName("qingjia")
public class QingjiaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QingjiaEntity() {

	}

	public QingjiaEntity(T t) {
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
    @TableField(value = "hugong_id")

    private Integer hugongId;


    /**
     * 请假原因
     */
    @TableField(value = "qingjia_text")

    private String qingjiaText;


    /**
     * 请假时间
     */
    @TableField(value = "qingjia_shijian")

    private String qingjiaShijian;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "qingjia_time")

    private Date qingjiaTime;


    /**
     * 审核结果
     */
    @TableField(value = "qingjia_yesno_types")

    private Integer qingjiaYesnoTypes;


    /**
     * 审核原因
     */
    @TableField(value = "qingjia_yesno_text")

    private String qingjiaYesnoText;


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
    public Integer getHugongId() {
        return hugongId;
    }


    /**
	 * 获取：申请人
	 */

    public void setHugongId(Integer hugongId) {
        this.hugongId = hugongId;
    }
    /**
	 * 设置：请假原因
	 */
    public String getQingjiaText() {
        return qingjiaText;
    }


    /**
	 * 获取：请假原因
	 */

    public void setQingjiaText(String qingjiaText) {
        this.qingjiaText = qingjiaText;
    }
    /**
	 * 设置：请假时间
	 */
    public String getQingjiaShijian() {
        return qingjiaShijian;
    }


    /**
	 * 获取：请假时间
	 */

    public void setQingjiaShijian(String qingjiaShijian) {
        this.qingjiaShijian = qingjiaShijian;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getQingjiaTime() {
        return qingjiaTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setQingjiaTime(Date qingjiaTime) {
        this.qingjiaTime = qingjiaTime;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getQingjiaYesnoTypes() {
        return qingjiaYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setQingjiaYesnoTypes(Integer qingjiaYesnoTypes) {
        this.qingjiaYesnoTypes = qingjiaYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getQingjiaYesnoText() {
        return qingjiaYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setQingjiaYesnoText(String qingjiaYesnoText) {
        this.qingjiaYesnoText = qingjiaYesnoText;
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
        return "Qingjia{" +
            "id=" + id +
            ", hugongId=" + hugongId +
            ", qingjiaText=" + qingjiaText +
            ", qingjiaShijian=" + qingjiaShijian +
            ", qingjiaTime=" + qingjiaTime +
            ", qingjiaYesnoTypes=" + qingjiaYesnoTypes +
            ", qingjiaYesnoText=" + qingjiaYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
