package com.entity.view;

import com.entity.FeiyongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 费用
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("feiyong")
public class FeiyongView extends FeiyongEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String feiyongValue;



	public FeiyongView() {

	}

	public FeiyongView(FeiyongEntity feiyongEntity) {
		try {
			BeanUtils.copyProperties(this, feiyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getFeiyongValue() {
				return feiyongValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setFeiyongValue(String feiyongValue) {
				this.feiyongValue = feiyongValue;
			}












}
