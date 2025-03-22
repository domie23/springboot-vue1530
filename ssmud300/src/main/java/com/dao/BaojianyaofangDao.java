package com.dao;

import com.entity.BaojianyaofangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaojianyaofangVO;
import com.entity.view.BaojianyaofangView;


/**
 * 保健药方
 * 
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface BaojianyaofangDao extends BaseMapper<BaojianyaofangEntity> {
	
	List<BaojianyaofangVO> selectListVO(@Param("ew") Wrapper<BaojianyaofangEntity> wrapper);
	
	BaojianyaofangVO selectVO(@Param("ew") Wrapper<BaojianyaofangEntity> wrapper);
	
	List<BaojianyaofangView> selectListView(@Param("ew") Wrapper<BaojianyaofangEntity> wrapper);

	List<BaojianyaofangView> selectListView(Pagination page,@Param("ew") Wrapper<BaojianyaofangEntity> wrapper);
	
	BaojianyaofangView selectView(@Param("ew") Wrapper<BaojianyaofangEntity> wrapper);
	
}
