package com.entity.model;

import com.entity.QingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 请假
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QingjiaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 申请人
     */
    private Integer hugongId;


    /**
     * 请假原因
     */
    private String qingjiaText;


    /**
     * 请假时间
     */
    private String qingjiaShijian;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date qingjiaTime;


    /**
     * 审核结果
     */
    private Integer qingjiaYesnoTypes;


    /**
     * 审核原因
     */
    private String qingjiaYesnoText;


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
    public Integer getHugongId() {
        return hugongId;
    }


    /**
	 * 设置：申请人
	 */
    public void setHugongId(Integer hugongId) {
        this.hugongId = hugongId;
    }
    /**
	 * 获取：请假原因
	 */
    public String getQingjiaText() {
        return qingjiaText;
    }


    /**
	 * 设置：请假原因
	 */
    public void setQingjiaText(String qingjiaText) {
        this.qingjiaText = qingjiaText;
    }
    /**
	 * 获取：请假时间
	 */
    public String getQingjiaShijian() {
        return qingjiaShijian;
    }


    /**
	 * 设置：请假时间
	 */
    public void setQingjiaShijian(String qingjiaShijian) {
        this.qingjiaShijian = qingjiaShijian;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getQingjiaTime() {
        return qingjiaTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setQingjiaTime(Date qingjiaTime) {
        this.qingjiaTime = qingjiaTime;
    }
    /**
	 * 获取：审核结果
	 */
    public Integer getQingjiaYesnoTypes() {
        return qingjiaYesnoTypes;
    }


    /**
	 * 设置：审核结果
	 */
    public void setQingjiaYesnoTypes(Integer qingjiaYesnoTypes) {
        this.qingjiaYesnoTypes = qingjiaYesnoTypes;
    }
    /**
	 * 获取：审核原因
	 */
    public String getQingjiaYesnoText() {
        return qingjiaYesnoText;
    }


    /**
	 * 设置：审核原因
	 */
    public void setQingjiaYesnoText(String qingjiaYesnoText) {
        this.qingjiaYesnoText = qingjiaYesnoText;
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
