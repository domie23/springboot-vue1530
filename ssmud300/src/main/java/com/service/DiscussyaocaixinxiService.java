package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyaocaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyaocaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyaocaixinxiView;


/**
 * 药材信息评论表
 *
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface DiscussyaocaixinxiService extends IService<DiscussyaocaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyaocaixinxiVO> selectListVO(Wrapper<DiscussyaocaixinxiEntity> wrapper);
   	
   	DiscussyaocaixinxiVO selectVO(@Param("ew") Wrapper<DiscussyaocaixinxiEntity> wrapper);
   	
   	List<DiscussyaocaixinxiView> selectListView(Wrapper<DiscussyaocaixinxiEntity> wrapper);
   	
   	DiscussyaocaixinxiView selectView(@Param("ew") Wrapper<DiscussyaocaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyaocaixinxiEntity> wrapper);
   	
}

