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


import com.dao.DiscussbaojianyaofangDao;
import com.entity.DiscussbaojianyaofangEntity;
import com.service.DiscussbaojianyaofangService;
import com.entity.vo.DiscussbaojianyaofangVO;
import com.entity.view.DiscussbaojianyaofangView;

@Service("discussbaojianyaofangService")
public class DiscussbaojianyaofangServiceImpl extends ServiceImpl<DiscussbaojianyaofangDao, DiscussbaojianyaofangEntity> implements DiscussbaojianyaofangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbaojianyaofangEntity> page = this.selectPage(
                new Query<DiscussbaojianyaofangEntity>(params).getPage(),
                new EntityWrapper<DiscussbaojianyaofangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbaojianyaofangEntity> wrapper) {
		  Page<DiscussbaojianyaofangView> page =new Query<DiscussbaojianyaofangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbaojianyaofangVO> selectListVO(Wrapper<DiscussbaojianyaofangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbaojianyaofangVO selectVO(Wrapper<DiscussbaojianyaofangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbaojianyaofangView> selectListView(Wrapper<DiscussbaojianyaofangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbaojianyaofangView selectView(Wrapper<DiscussbaojianyaofangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
