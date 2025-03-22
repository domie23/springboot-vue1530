package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbaojianyaofangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbaojianyaofangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbaojianyaofangView;


/**
 * 保健药方评论表
 *
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface DiscussbaojianyaofangService extends IService<DiscussbaojianyaofangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbaojianyaofangVO> selectListVO(Wrapper<DiscussbaojianyaofangEntity> wrapper);
   	
   	DiscussbaojianyaofangVO selectVO(@Param("ew") Wrapper<DiscussbaojianyaofangEntity> wrapper);
   	
   	List<DiscussbaojianyaofangView> selectListView(Wrapper<DiscussbaojianyaofangEntity> wrapper);
   	
   	DiscussbaojianyaofangView selectView(@Param("ew") Wrapper<DiscussbaojianyaofangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbaojianyaofangEntity> wrapper);
   	
}

