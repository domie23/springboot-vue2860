package com.entity.view;

import com.entity.QingjiaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 请假
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("qingjia")
public class QingjiaView extends QingjiaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核结果的值
		*/
		private String qingjiaYesnoValue;



		//级联表 hugong
			/**
			* 护工姓名
			*/
			private String hugongName;
			/**
			* 头像
			*/
			private String hugongPhoto;
			/**
			* 护工手机号
			*/
			private String hugongPhone;
			/**
			* 护工身份证号
			*/
			private String hugongIdNumber;
			/**
			* 邮箱
			*/
			private String hugongEmail;
			/**
			* 假删
			*/
			private Integer hugongDelete;

	public QingjiaView() {

	}

	public QingjiaView(QingjiaEntity qingjiaEntity) {
		try {
			BeanUtils.copyProperties(this, qingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核结果的值
			*/
			public String getQingjiaYesnoValue() {
				return qingjiaYesnoValue;
			}
			/**
			* 设置： 审核结果的值
			*/
			public void setQingjiaYesnoValue(String qingjiaYesnoValue) {
				this.qingjiaYesnoValue = qingjiaYesnoValue;
			}










				//级联表的get和set hugong
					/**
					* 获取： 护工姓名
					*/
					public String getHugongName() {
						return hugongName;
					}
					/**
					* 设置： 护工姓名
					*/
					public void setHugongName(String hugongName) {
						this.hugongName = hugongName;
					}
					/**
					* 获取： 头像
					*/
					public String getHugongPhoto() {
						return hugongPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setHugongPhoto(String hugongPhoto) {
						this.hugongPhoto = hugongPhoto;
					}
					/**
					* 获取： 护工手机号
					*/
					public String getHugongPhone() {
						return hugongPhone;
					}
					/**
					* 设置： 护工手机号
					*/
					public void setHugongPhone(String hugongPhone) {
						this.hugongPhone = hugongPhone;
					}
					/**
					* 获取： 护工身份证号
					*/
					public String getHugongIdNumber() {
						return hugongIdNumber;
					}
					/**
					* 设置： 护工身份证号
					*/
					public void setHugongIdNumber(String hugongIdNumber) {
						this.hugongIdNumber = hugongIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getHugongEmail() {
						return hugongEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setHugongEmail(String hugongEmail) {
						this.hugongEmail = hugongEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getHugongDelete() {
						return hugongDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setHugongDelete(Integer hugongDelete) {
						this.hugongDelete = hugongDelete;
					}












}
