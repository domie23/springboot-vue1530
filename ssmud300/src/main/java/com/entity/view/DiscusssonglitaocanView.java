package com.entity.view;

import com.entity.DiscusssonglitaocanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 送礼套餐评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
@TableName("discusssonglitaocan")
public class DiscusssonglitaocanView  extends DiscusssonglitaocanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusssonglitaocanView(){
	}
 
 	public DiscusssonglitaocanView(DiscusssonglitaocanEntity discusssonglitaocanEntity){
 	try {
			BeanUtils.copyProperties(this, discusssonglitaocanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
