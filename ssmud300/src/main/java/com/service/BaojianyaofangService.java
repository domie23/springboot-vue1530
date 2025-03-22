package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaojianyaofangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaojianyaofangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaojianyaofangView;


/**
 * 保健药方
 *
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
public interface BaojianyaofangService extends IService<BaojianyaofangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaojianyaofangVO> selectListVO(Wrapper<BaojianyaofangEntity> wrapper);
   	
   	BaojianyaofangVO selectVO(@Param("ew") Wrapper<BaojianyaofangEntity> wrapper);
   	
   	List<BaojianyaofangView> selectListView(Wrapper<BaojianyaofangEntity> wrapper);
   	
   	BaojianyaofangView selectView(@Param("ew") Wrapper<BaojianyaofangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaojianyaofangEntity> wrapper);
   	
}

