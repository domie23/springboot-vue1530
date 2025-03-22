package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.SonglitaocanEntity;
import com.entity.view.SonglitaocanView;

import com.service.SonglitaocanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 送礼套餐
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
@RestController
@RequestMapping("/songlitaocan")
public class SonglitaocanController {
    @Autowired
    private SonglitaocanService songlitaocanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SonglitaocanEntity songlitaocan, HttpServletRequest request){

        EntityWrapper<SonglitaocanEntity> ew = new EntityWrapper<SonglitaocanEntity>();
		PageUtils page = songlitaocanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, songlitaocan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SonglitaocanEntity songlitaocan, HttpServletRequest request){
        EntityWrapper<SonglitaocanEntity> ew = new EntityWrapper<SonglitaocanEntity>();
		PageUtils page = songlitaocanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, songlitaocan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SonglitaocanEntity songlitaocan){
       	EntityWrapper<SonglitaocanEntity> ew = new EntityWrapper<SonglitaocanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( songlitaocan, "songlitaocan")); 
        return R.ok().put("data", songlitaocanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SonglitaocanEntity songlitaocan){
        EntityWrapper< SonglitaocanEntity> ew = new EntityWrapper< SonglitaocanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( songlitaocan, "songlitaocan")); 
		SonglitaocanView songlitaocanView =  songlitaocanService.selectView(ew);
		return R.ok("查询送礼套餐成功").put("data", songlitaocanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        SonglitaocanEntity songlitaocan = songlitaocanService.selectById(id);
        return R.ok().put("data", songlitaocan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        SonglitaocanEntity songlitaocan = songlitaocanService.selectById(id);
        return R.ok().put("data", songlitaocan);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        SonglitaocanEntity songlitaocan = songlitaocanService.selectById(id);
        if(type.equals("1")) {
        	songlitaocan.setThumbsupnum(songlitaocan.getThumbsupnum()+1);
        } else {
        	songlitaocan.setCrazilynum(songlitaocan.getCrazilynum()+1);
        }
        songlitaocanService.updateById(songlitaocan);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SonglitaocanEntity songlitaocan, HttpServletRequest request){
    	songlitaocan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(songlitaocan);

        songlitaocanService.insert(songlitaocan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SonglitaocanEntity songlitaocan, HttpServletRequest request){
    	songlitaocan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(songlitaocan);

        songlitaocanService.insert(songlitaocan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SonglitaocanEntity songlitaocan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(songlitaocan);
        songlitaocanService.updateById(songlitaocan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        songlitaocanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<SonglitaocanEntity> wrapper = new EntityWrapper<SonglitaocanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = songlitaocanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
