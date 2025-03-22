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


import com.dao.YaocaixinxiDao;
import com.entity.YaocaixinxiEntity;
import com.service.YaocaixinxiService;
import com.entity.vo.YaocaixinxiVO;
import com.entity.view.YaocaixinxiView;

@Service("yaocaixinxiService")
public class YaocaixinxiServiceImpl extends ServiceImpl<YaocaixinxiDao, YaocaixinxiEntity> implements YaocaixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaocaixinxiEntity> page = this.selectPage(
                new Query<YaocaixinxiEntity>(params).getPage(),
                new EntityWrapper<YaocaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaocaixinxiEntity> wrapper) {
		  Page<YaocaixinxiView> page =new Query<YaocaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaocaixinxiVO> selectListVO(Wrapper<YaocaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaocaixinxiVO selectVO(Wrapper<YaocaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaocaixinxiView> selectListView(Wrapper<YaocaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaocaixinxiView selectView(Wrapper<YaocaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
