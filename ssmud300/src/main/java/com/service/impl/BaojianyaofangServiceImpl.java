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


import com.dao.BaojianyaofangDao;
import com.entity.BaojianyaofangEntity;
import com.service.BaojianyaofangService;
import com.entity.vo.BaojianyaofangVO;
import com.entity.view.BaojianyaofangView;

@Service("baojianyaofangService")
public class BaojianyaofangServiceImpl extends ServiceImpl<BaojianyaofangDao, BaojianyaofangEntity> implements BaojianyaofangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaojianyaofangEntity> page = this.selectPage(
                new Query<BaojianyaofangEntity>(params).getPage(),
                new EntityWrapper<BaojianyaofangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaojianyaofangEntity> wrapper) {
		  Page<BaojianyaofangView> page =new Query<BaojianyaofangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaojianyaofangVO> selectListVO(Wrapper<BaojianyaofangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaojianyaofangVO selectVO(Wrapper<BaojianyaofangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaojianyaofangView> selectListView(Wrapper<BaojianyaofangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaojianyaofangView selectView(Wrapper<BaojianyaofangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
