package com.dao;

import com.entity.YaocaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaocaixinxiVO;
import com.entity.view.YaocaixinxiView;


/**
 * 药材信息
 * 
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface YaocaixinxiDao extends BaseMapper<YaocaixinxiEntity> {
	
	List<YaocaixinxiVO> selectListVO(@Param("ew") Wrapper<YaocaixinxiEntity> wrapper);
	
	YaocaixinxiVO selectVO(@Param("ew") Wrapper<YaocaixinxiEntity> wrapper);
	
	List<YaocaixinxiView> selectListView(@Param("ew") Wrapper<YaocaixinxiEntity> wrapper);

	List<YaocaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YaocaixinxiEntity> wrapper);
	
	YaocaixinxiView selectView(@Param("ew") Wrapper<YaocaixinxiEntity> wrapper);
	
}
