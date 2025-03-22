package com.entity.vo;

import com.entity.BaojianyaofangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 保健药方
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public class BaojianyaofangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
