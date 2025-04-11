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
 * 薪资
 *
 * @author 
 * @email
 */
@TableName("xinzi")
public class XinziEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinziEntity() {

	}

	public XinziEntity(T t) {
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
     * 护工
     */
    @TableField(value = "hugong_id")

    private Integer hugongId;


    /**
     * 类型
     */
    @TableField(value = "xinzi_types")

    private Integer xinziTypes;


    /**
     * 薪资数量
     */
    @TableField(value = "xinzi_number")

    private Double xinziNumber;


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
	 * 设置：护工
	 */
    public Integer getHugongId() {
        return hugongId;
    }


    /**
	 * 获取：护工
	 */

    public void setHugongId(Integer hugongId) {
        this.hugongId = hugongId;
    }
    /**
	 * 设置：类型
	 */
    public Integer getXinziTypes() {
        return xinziTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setXinziTypes(Integer xinziTypes) {
        this.xinziTypes = xinziTypes;
    }
    /**
	 * 设置：薪资数量
	 */
    public Double getXinziNumber() {
        return xinziNumber;
    }


    /**
	 * 获取：薪资数量
	 */

    public void setXinziNumber(Double xinziNumber) {
        this.xinziNumber = xinziNumber;
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
        return "Xinzi{" +
            "id=" + id +
            ", hugongId=" + hugongId +
            ", xinziTypes=" + xinziTypes +
            ", xinziNumber=" + xinziNumber +
            ", createTime=" + createTime +
        "}";
    }
}
