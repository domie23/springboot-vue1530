package com.dao;

import com.entity.YaocaifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaocaifenleiVO;
import com.entity.view.YaocaifenleiView;


/**
 * 药材分类
 * 
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface YaocaifenleiDao extends BaseMapper<YaocaifenleiEntity> {
	
	List<YaocaifenleiVO> selectListVO(@Param("ew") Wrapper<YaocaifenleiEntity> wrapper);
	
	YaocaifenleiVO selectVO(@Param("ew") Wrapper<YaocaifenleiEntity> wrapper);
	
	List<YaocaifenleiView> selectListView(@Param("ew") Wrapper<YaocaifenleiEntity> wrapper);

	List<YaocaifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YaocaifenleiEntity> wrapper);
	
	YaocaifenleiView selectView(@Param("ew") Wrapper<YaocaifenleiEntity> wrapper);
	
}
