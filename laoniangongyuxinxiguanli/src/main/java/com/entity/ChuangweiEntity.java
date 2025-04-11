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
 * 床位
 *
 * @author 
 * @email
 */
@TableName("chuangwei")
public class ChuangweiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChuangweiEntity() {

	}

	public ChuangweiEntity(T t) {
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
     * 床位编号
     */
    @TableField(value = "chuangwei_uuid_number")

    private String chuangweiUuidNumber;


    /**
     * 所属房间
     */
    @TableField(value = "fangjian_name")

    private String fangjianName;


    /**
     * 使用人
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


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
	 * 设置：床位编号
	 */
    public String getChuangweiUuidNumber() {
        return chuangweiUuidNumber;
    }


    /**
	 * 获取：床位编号
	 */

    public void setChuangweiUuidNumber(String chuangweiUuidNumber) {
        this.chuangweiUuidNumber = chuangweiUuidNumber;
    }
    /**
	 * 设置：所属房间
	 */
    public String getFangjianName() {
        return fangjianName;
    }


    /**
	 * 获取：所属房间
	 */

    public void setFangjianName(String fangjianName) {
        this.fangjianName = fangjianName;
    }
    /**
	 * 设置：使用人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：使用人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
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
        return "Chuangwei{" +
            "id=" + id +
            ", chuangweiUuidNumber=" + chuangweiUuidNumber +
            ", fangjianName=" + fangjianName +
            ", yonghuId=" + yonghuId +
            ", createTime=" + createTime +
        "}";
    }
}
