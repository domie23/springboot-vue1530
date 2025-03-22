package com.dao;

import com.entity.SonglitaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SonglitaocanVO;
import com.entity.view.SonglitaocanView;


/**
 * 送礼套餐
 * 
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface SonglitaocanDao extends BaseMapper<SonglitaocanEntity> {
	
	List<SonglitaocanVO> selectListVO(@Param("ew") Wrapper<SonglitaocanEntity> wrapper);
	
	SonglitaocanVO selectVO(@Param("ew") Wrapper<SonglitaocanEntity> wrapper);
	
	List<SonglitaocanView> selectListView(@Param("ew") Wrapper<SonglitaocanEntity> wrapper);

	List<SonglitaocanView> selectListView(Pagination page,@Param("ew") Wrapper<SonglitaocanEntity> wrapper);
	
	SonglitaocanView selectView(@Param("ew") Wrapper<SonglitaocanEntity> wrapper);
	
}
