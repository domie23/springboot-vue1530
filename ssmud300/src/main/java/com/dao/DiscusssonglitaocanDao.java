package com.dao;

import com.entity.DiscusssonglitaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusssonglitaocanVO;
import com.entity.view.DiscusssonglitaocanView;


/**
 * 送礼套餐评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface DiscusssonglitaocanDao extends BaseMapper<DiscusssonglitaocanEntity> {
	
	List<DiscusssonglitaocanVO> selectListVO(@Param("ew") Wrapper<DiscusssonglitaocanEntity> wrapper);
	
	DiscusssonglitaocanVO selectVO(@Param("ew") Wrapper<DiscusssonglitaocanEntity> wrapper);
	
	List<DiscusssonglitaocanView> selectListView(@Param("ew") Wrapper<DiscusssonglitaocanEntity> wrapper);

	List<DiscusssonglitaocanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusssonglitaocanEntity> wrapper);
	
	DiscusssonglitaocanView selectView(@Param("ew") Wrapper<DiscusssonglitaocanEntity> wrapper);
	
}
