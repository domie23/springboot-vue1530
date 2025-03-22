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


import com.dao.SonglitaocanDao;
import com.entity.SonglitaocanEntity;
import com.service.SonglitaocanService;
import com.entity.vo.SonglitaocanVO;
import com.entity.view.SonglitaocanView;

@Service("songlitaocanService")
public class SonglitaocanServiceImpl extends ServiceImpl<SonglitaocanDao, SonglitaocanEntity> implements SonglitaocanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SonglitaocanEntity> page = this.selectPage(
                new Query<SonglitaocanEntity>(params).getPage(),
                new EntityWrapper<SonglitaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SonglitaocanEntity> wrapper) {
		  Page<SonglitaocanView> page =new Query<SonglitaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SonglitaocanVO> selectListVO(Wrapper<SonglitaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SonglitaocanVO selectVO(Wrapper<SonglitaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SonglitaocanView> selectListView(Wrapper<SonglitaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SonglitaocanView selectView(Wrapper<SonglitaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
