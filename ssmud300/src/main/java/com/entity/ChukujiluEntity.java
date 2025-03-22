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
 * 出库记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
@TableName("chukujilu")
public class ChukujiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChukujiluEntity() {
		
	}
	
	public ChukujiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 药材编号
	 */
					
	private String yaocaibianhao;
	
	/**
	 * 药材名称
	 */
					
	private String yaocaimingcheng;
	
	/**
	 * 药材类型
	 */
					
	private String yaocaileixing;
	
	/**
	 * 药材库存
	 */
					
	private Integer yaocaikucun;
	
	/**
	 * 出库时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chukushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：药材编号
	 */
	public void setYaocaibianhao(String yaocaibianhao) {
		this.yaocaibianhao = yaocaibianhao;
	}
	/**
	 * 获取：药材编号
	 */
	public String getYaocaibianhao() {
		return yaocaibianhao;
	}
	/**
	 * 设置：药材名称
	 */
	public void setYaocaimingcheng(String yaocaimingcheng) {
		this.yaocaimingcheng = yaocaimingcheng;
	}
	/**
	 * 获取：药材名称
	 */
	public String getYaocaimingcheng() {
		return yaocaimingcheng;
	}
	/**
	 * 设置：药材类型
	 */
	public void setYaocaileixing(String yaocaileixing) {
		this.yaocaileixing = yaocaileixing;
	}
	/**
	 * 获取：药材类型
	 */
	public String getYaocaileixing() {
		return yaocaileixing;
	}
	/**
	 * 设置：药材库存
	 */
	public void setYaocaikucun(Integer yaocaikucun) {
		this.yaocaikucun = yaocaikucun;
	}
	/**
	 * 获取：药材库存
	 */
	public Integer getYaocaikucun() {
		return yaocaikucun;
	}
	/**
	 * 设置：出库时间
	 */
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	/**
	 * 获取：出库时间
	 */
	public Date getChukushijian() {
		return chukushijian;
	}

}
