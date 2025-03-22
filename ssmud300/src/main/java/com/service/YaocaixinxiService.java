package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaocaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaocaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaocaixinxiView;


/**
 * 药材信息
 *
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface YaocaixinxiService extends IService<YaocaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaocaixinxiVO> selectListVO(Wrapper<YaocaixinxiEntity> wrapper);
   	
   	YaocaixinxiVO selectVO(@Param("ew") Wrapper<YaocaixinxiEntity> wrapper);
   	
   	List<YaocaixinxiView> selectListView(Wrapper<YaocaixinxiEntity> wrapper);
   	
   	YaocaixinxiView selectView(@Param("ew") Wrapper<YaocaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaocaixinxiEntity> wrapper);
   	
}

