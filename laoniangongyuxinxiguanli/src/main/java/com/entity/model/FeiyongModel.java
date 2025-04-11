package com.entity.model;

import com.entity.FeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 费用
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FeiyongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String fangjianName;


    /**
     * 类型
     */
    private Integer feiyongTypes;


    /**
     * 所需费用
     */
    private Double feiyong;


    /**
     * 费用详情
     */
    private String feiyongContent;


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
	 * 获取：标题
	 */
    public String getFangjianName() {
        return fangjianName;
    }


    /**
	 * 设置：标题
	 */
    public void setFangjianName(String fangjianName) {
        this.fangjianName = fangjianName;
    }
    /**
	 * 获取：类型
	 */
    public Integer getFeiyongTypes() {
        return feiyongTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setFeiyongTypes(Integer feiyongTypes) {
        this.feiyongTypes = feiyongTypes;
    }
    /**
	 * 获取：所需费用
	 */
    public Double getFeiyong() {
        return feiyong;
    }


    /**
	 * 设置：所需费用
	 */
    public void setFeiyong(Double feiyong) {
        this.feiyong = feiyong;
    }
    /**
	 * 获取：费用详情
	 */
    public String getFeiyongContent() {
        return feiyongContent;
    }


    /**
	 * 设置：费用详情
	 */
    public void setFeiyongContent(String feiyongContent) {
        this.feiyongContent = feiyongContent;
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
