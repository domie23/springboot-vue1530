package com.dao;

import com.entity.DiscussyaocaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyaocaixinxiVO;
import com.entity.view.DiscussyaocaixinxiView;


/**
 * 药材信息评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface DiscussyaocaixinxiDao extends BaseMapper<DiscussyaocaixinxiEntity> {
	
	List<DiscussyaocaixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyaocaixinxiEntity> wrapper);
	
	DiscussyaocaixinxiVO selectVO(@Param("ew") Wrapper<DiscussyaocaixinxiEntity> wrapper);
	
	List<DiscussyaocaixinxiView> selectListView(@Param("ew") Wrapper<DiscussyaocaixinxiEntity> wrapper);

	List<DiscussyaocaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyaocaixinxiEntity> wrapper);
	
	DiscussyaocaixinxiView selectView(@Param("ew") Wrapper<DiscussyaocaixinxiEntity> wrapper);
	
}
