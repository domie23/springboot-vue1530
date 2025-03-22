package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusssonglitaocanDao;
import com.entity.DiscusssonglitaocanEntity;
import com.service.DiscusssonglitaocanService;
import com.entity.vo.DiscusssonglitaocanVO;
import com.entity.view.DiscusssonglitaocanView;

@Service("discusssonglitaocanService")
public class DiscusssonglitaocanServiceImpl extends ServiceImpl<DiscusssonglitaocanDao, DiscusssonglitaocanEntity> implements DiscusssonglitaocanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusssonglitaocanEntity> page = this.selectPage(
                new Query<DiscusssonglitaocanEntity>(params).getPage(),
                new EntityWrapper<DiscusssonglitaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusssonglitaocanEntity> wrapper) {
		  Page<DiscusssonglitaocanView> page =new Query<DiscusssonglitaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusssonglitaocanVO> selectListVO(Wrapper<DiscusssonglitaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusssonglitaocanVO selectVO(Wrapper<DiscusssonglitaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusssonglitaocanView> selectListView(Wrapper<DiscusssonglitaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusssonglitaocanView selectView(Wrapper<DiscusssonglitaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
