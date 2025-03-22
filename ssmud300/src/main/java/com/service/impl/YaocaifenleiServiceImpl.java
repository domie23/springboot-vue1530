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


import com.dao.YaocaifenleiDao;
import com.entity.YaocaifenleiEntity;
import com.service.YaocaifenleiService;
import com.entity.vo.YaocaifenleiVO;
import com.entity.view.YaocaifenleiView;

@Service("yaocaifenleiService")
public class YaocaifenleiServiceImpl extends ServiceImpl<YaocaifenleiDao, YaocaifenleiEntity> implements YaocaifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaocaifenleiEntity> page = this.selectPage(
                new Query<YaocaifenleiEntity>(params).getPage(),
                new EntityWrapper<YaocaifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaocaifenleiEntity> wrapper) {
		  Page<YaocaifenleiView> page =new Query<YaocaifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaocaifenleiVO> selectListVO(Wrapper<YaocaifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaocaifenleiVO selectVO(Wrapper<YaocaifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaocaifenleiView> selectListView(Wrapper<YaocaifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaocaifenleiView selectView(Wrapper<YaocaifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
