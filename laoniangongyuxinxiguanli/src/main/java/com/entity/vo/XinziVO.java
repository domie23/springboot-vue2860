package com.entity.vo;

import com.entity.XinziEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 薪资
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xinzi")
public class XinziVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
