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


import com.dao.DiscussyaocaixinxiDao;
import com.entity.DiscussyaocaixinxiEntity;
import com.service.DiscussyaocaixinxiService;
import com.entity.vo.DiscussyaocaixinxiVO;
import com.entity.view.DiscussyaocaixinxiView;

@Service("discussyaocaixinxiService")
public class DiscussyaocaixinxiServiceImpl extends ServiceImpl<DiscussyaocaixinxiDao, DiscussyaocaixinxiEntity> implements DiscussyaocaixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyaocaixinxiEntity> page = this.selectPage(
                new Query<DiscussyaocaixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyaocaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyaocaixinxiEntity> wrapper) {
		  Page<DiscussyaocaixinxiView> page =new Query<DiscussyaocaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyaocaixinxiVO> selectListVO(Wrapper<DiscussyaocaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyaocaixinxiVO selectVO(Wrapper<DiscussyaocaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyaocaixinxiView> selectListView(Wrapper<DiscussyaocaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyaocaixinxiView selectView(Wrapper<DiscussyaocaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
