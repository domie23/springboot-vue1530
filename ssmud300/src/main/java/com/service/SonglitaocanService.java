package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SonglitaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SonglitaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SonglitaocanView;


/**
 * 送礼套餐
 *
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface SonglitaocanService extends IService<SonglitaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SonglitaocanVO> selectListVO(Wrapper<SonglitaocanEntity> wrapper);
   	
   	SonglitaocanVO selectVO(@Param("ew") Wrapper<SonglitaocanEntity> wrapper);
   	
   	List<SonglitaocanView> selectListView(Wrapper<SonglitaocanEntity> wrapper);
   	
   	SonglitaocanView selectView(@Param("ew") Wrapper<SonglitaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SonglitaocanEntity> wrapper);
   	
}

