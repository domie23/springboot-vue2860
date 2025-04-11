package com.entity.vo;

import com.entity.FeiyongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 费用
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("feiyong")
public class FeiyongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "fangjian_name")
    private String fangjianName;


    /**
     * 类型
     */

    @TableField(value = "feiyong_types")
    private Integer feiyongTypes;


    /**
     * 所需费用
     */

    @TableField(value = "feiyong")
    private Double feiyong;


    /**
     * 费用详情
     */

    @TableField(value = "feiyong_content")
    private String feiyongContent;


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
	 * 设置：标题
	 */
    public String getFangjianName() {
        return fangjianName;
    }


    /**
	 * 获取：标题
	 */

    public void setFangjianName(String fangjianName) {
        this.fangjianName = fangjianName;
    }
    /**
	 * 设置：类型
	 */
    public Integer getFeiyongTypes() {
        return feiyongTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setFeiyongTypes(Integer feiyongTypes) {
        this.feiyongTypes = feiyongTypes;
    }
    /**
	 * 设置：所需费用
	 */
    public Double getFeiyong() {
        return feiyong;
    }


    /**
	 * 获取：所需费用
	 */

    public void setFeiyong(Double feiyong) {
        this.feiyong = feiyong;
    }
    /**
	 * 设置：费用详情
	 */
    public String getFeiyongContent() {
        return feiyongContent;
    }


    /**
	 * 获取：费用详情
	 */

    public void setFeiyongContent(String feiyongContent) {
        this.feiyongContent = feiyongContent;
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
