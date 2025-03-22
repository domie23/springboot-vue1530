package com.entity.model;

import com.entity.YaocaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 药材信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public class YaocaixinxiModel  implements Serializable {
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
	 * 药材图片
	 */
	
	private String yaocaitupian;
		
	/**
	 * 药材介绍
	 */
	
	private String yaocaijieshao;
		
	/**
	 * 药材详情
	 */
	
	private String yaocaixiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 积分
	 */
	
	private Integer jifen;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
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
	 * 设置：药材图片
	 */
	 
	public void setYaocaitupian(String yaocaitupian) {
		this.yaocaitupian = yaocaitupian;
	}
	
	/**
	 * 获取：药材图片
	 */
	public String getYaocaitupian() {
		return yaocaitupian;
	}
				
	
	/**
	 * 设置：药材介绍
	 */
	 
	public void setYaocaijieshao(String yaocaijieshao) {
		this.yaocaijieshao = yaocaijieshao;
	}
	
	/**
	 * 获取：药材介绍
	 */
	public String getYaocaijieshao() {
		return yaocaijieshao;
	}
				
	
	/**
	 * 设置：药材详情
	 */
	 
	public void setYaocaixiangqing(String yaocaixiangqing) {
		this.yaocaixiangqing = yaocaixiangqing;
	}
	
	/**
	 * 获取：药材详情
	 */
	public String getYaocaixiangqing() {
		return yaocaixiangqing;
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
				
	
	/**
	 * 设置：积分
	 */
	 
	public void setJifen(Integer jifen) {
		this.jifen = jifen;
	}
	
	/**
	 * 获取：积分
	 */
	public Integer getJifen() {
		return jifen;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
