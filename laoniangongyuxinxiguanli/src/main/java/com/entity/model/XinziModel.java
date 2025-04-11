package com.entity.model;

import com.entity.XinziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 薪资
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XinziModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 护工
     */
    private Integer hugongId;


    /**
     * 类型
     */
    private Integer xinziTypes;


    /**
     * 薪资数量
     */
    private Double xinziNumber;


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
	 * 获取：护工
	 */
    public Integer getHugongId() {
        return hugongId;
    }


    /**
	 * 设置：护工
	 */
    public void setHugongId(Integer hugongId) {
        this.hugongId = hugongId;
    }
    /**
	 * 获取：类型
	 */
    public Integer getXinziTypes() {
        return xinziTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setXinziTypes(Integer xinziTypes) {
        this.xinziTypes = xinziTypes;
    }
    /**
	 * 获取：薪资数量
	 */
    public Double getXinziNumber() {
        return xinziNumber;
    }


    /**
	 * 设置：薪资数量
	 */
    public void setXinziNumber(Double xinziNumber) {
        this.xinziNumber = xinziNumber;
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
