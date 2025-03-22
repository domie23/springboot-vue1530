package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusssonglitaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusssonglitaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusssonglitaocanView;


/**
 * 送礼套餐评论表
 *
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface DiscusssonglitaocanService extends IService<DiscusssonglitaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusssonglitaocanVO> selectListVO(Wrapper<DiscusssonglitaocanEntity> wrapper);
   	
   	DiscusssonglitaocanVO selectVO(@Param("ew") Wrapper<DiscusssonglitaocanEntity> wrapper);
   	
   	List<DiscusssonglitaocanView> selectListView(Wrapper<DiscusssonglitaocanEntity> wrapper);
   	
   	DiscusssonglitaocanView selectView(@Param("ew") Wrapper<DiscusssonglitaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusssonglitaocanEntity> wrapper);
   	
}

