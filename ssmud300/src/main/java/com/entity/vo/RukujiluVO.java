package com.entity.vo;

import com.entity.RukujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 入库记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public class RukujiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 入库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rukushijian;
				
	
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
	 * 设置：入库时间
	 */
	 
	public void setRukushijian(Date rukushijian) {
		this.rukushijian = rukushijian;
	}
	
	/**
	 * 获取：入库时间
	 */
	public Date getRukushijian() {
		return rukushijian;
	}
			
}
