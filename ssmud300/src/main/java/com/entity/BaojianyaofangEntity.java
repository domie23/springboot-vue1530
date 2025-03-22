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
 * 保健药方
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
@TableName("baojianyaofang")
public class BaojianyaofangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaojianyaofangEntity() {
		
	}
	
	public BaojianyaofangEntity(T t) {
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
	 * 药方标题
	 */
					
	private String yaofangbiaoti;
	
	/**
	 * 适用人群
	 */
					
	private String shiyongrenqun;
	
	/**
	 * 适用季节
	 */
					
	private String shiyongjijie;
	
	/**
	 * 用量用法
	 */
					
	private String yongliangyongfa;
	
	/**
	 * 药材及数量
	 */
					
	private String yaocaijishuliang;
	
	/**
	 * 封面图片
	 */
					
	private String fengmiantupian;
	
	/**
	 * 药方功效
	 */
					
	private String yaofanggongxiao;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：药方标题
	 */
	public void setYaofangbiaoti(String yaofangbiaoti) {
		this.yaofangbiaoti = yaofangbiaoti;
	}
	/**
	 * 获取：药方标题
	 */
	public String getYaofangbiaoti() {
		return yaofangbiaoti;
	}
	/**
	 * 设置：适用人群
	 */
	public void setShiyongrenqun(String shiyongrenqun) {
		this.shiyongrenqun = shiyongrenqun;
	}
	/**
	 * 获取：适用人群
	 */
	public String getShiyongrenqun() {
		return shiyongrenqun;
	}
	/**
	 * 设置：适用季节
	 */
	public void setShiyongjijie(String shiyongjijie) {
		this.shiyongjijie = shiyongjijie;
	}
	/**
	 * 获取：适用季节
	 */
	public String getShiyongjijie() {
		return shiyongjijie;
	}
	/**
	 * 设置：用量用法
	 */
	public void setYongliangyongfa(String yongliangyongfa) {
		this.yongliangyongfa = yongliangyongfa;
	}
	/**
	 * 获取：用量用法
	 */
	public String getYongliangyongfa() {
		return yongliangyongfa;
	}
	/**
	 * 设置：药材及数量
	 */
	public void setYaocaijishuliang(String yaocaijishuliang) {
		this.yaocaijishuliang = yaocaijishuliang;
	}
	/**
	 * 获取：药材及数量
	 */
	public String getYaocaijishuliang() {
		return yaocaijishuliang;
	}
	/**
	 * 设置：封面图片
	 */
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
	/**
	 * 设置：药方功效
	 */
	public void setYaofanggongxiao(String yaofanggongxiao) {
		this.yaofanggongxiao = yaofanggongxiao;
	}
	/**
	 * 获取：药方功效
	 */
	public String getYaofanggongxiao() {
		return yaofanggongxiao;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}
