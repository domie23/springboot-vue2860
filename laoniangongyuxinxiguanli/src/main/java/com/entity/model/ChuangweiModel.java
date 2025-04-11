package com.entity.model;

import com.entity.ChuangweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 床位
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChuangweiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 床位编号
     */
    private String chuangweiUuidNumber;


    /**
     * 所属房间
     */
    private String fangjianName;


    /**
     * 使用人
     */
    private Integer yonghuId;


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
	 * 获取：床位编号
	 */
    public String getChuangweiUuidNumber() {
        return chuangweiUuidNumber;
    }


    /**
	 * 设置：床位编号
	 */
    public void setChuangweiUuidNumber(String chuangweiUuidNumber) {
        this.chuangweiUuidNumber = chuangweiUuidNumber;
    }
    /**
	 * 获取：所属房间
	 */
    public String getFangjianName() {
        return fangjianName;
    }


    /**
	 * 设置：所属房间
	 */
    public void setFangjianName(String fangjianName) {
        this.fangjianName = fangjianName;
    }
    /**
	 * 获取：使用人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：使用人
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
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
