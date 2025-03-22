package com.dao;

import com.entity.DiscussbaojianyaofangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbaojianyaofangVO;
import com.entity.view.DiscussbaojianyaofangView;


/**
 * 保健药方评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface DiscussbaojianyaofangDao extends BaseMapper<DiscussbaojianyaofangEntity> {
	
	List<DiscussbaojianyaofangVO> selectListVO(@Param("ew") Wrapper<DiscussbaojianyaofangEntity> wrapper);
	
	DiscussbaojianyaofangVO selectVO(@Param("ew") Wrapper<DiscussbaojianyaofangEntity> wrapper);
	
	List<DiscussbaojianyaofangView> selectListView(@Param("ew") Wrapper<DiscussbaojianyaofangEntity> wrapper);

	List<DiscussbaojianyaofangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbaojianyaofangEntity> wrapper);
	
	DiscussbaojianyaofangView selectView(@Param("ew") Wrapper<DiscussbaojianyaofangEntity> wrapper);
	
}
