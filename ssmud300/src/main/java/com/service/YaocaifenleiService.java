package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaocaifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaocaifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaocaifenleiView;


/**
 * 药材分类
 *
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface YaocaifenleiService extends IService<YaocaifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaocaifenleiVO> selectListVO(Wrapper<YaocaifenleiEntity> wrapper);
   	
   	YaocaifenleiVO selectVO(@Param("ew") Wrapper<YaocaifenleiEntity> wrapper);
   	
   	List<YaocaifenleiView> selectListView(Wrapper<YaocaifenleiEntity> wrapper);
   	
   	YaocaifenleiView selectView(@Param("ew") Wrapper<YaocaifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaocaifenleiEntity> wrapper);
   	
}

