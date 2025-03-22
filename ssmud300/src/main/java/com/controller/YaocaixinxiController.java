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

import com.entity.YaocaixinxiEntity;
import com.entity.view.YaocaixinxiView;

import com.service.YaocaixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 药材信息
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-19 10:24:21
 */
@RestController
@RequestMapping("/yaocaixinxi")
public class YaocaixinxiController {
    @Autowired
    private YaocaixinxiService yaocaixinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YaocaixinxiEntity yaocaixinxi, HttpServletRequest request){

        EntityWrapper<YaocaixinxiEntity> ew = new EntityWrapper<YaocaixinxiEntity>();
		PageUtils page = yaocaixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaocaixinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YaocaixinxiEntity yaocaixinxi, HttpServletRequest request){
        EntityWrapper<YaocaixinxiEntity> ew = new EntityWrapper<YaocaixinxiEntity>();
		PageUtils page = yaocaixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaocaixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YaocaixinxiEntity yaocaixinxi){
       	EntityWrapper<YaocaixinxiEntity> ew = new EntityWrapper<YaocaixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yaocaixinxi, "yaocaixinxi")); 
        return R.ok().put("data", yaocaixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YaocaixinxiEntity yaocaixinxi){
        EntityWrapper< YaocaixinxiEntity> ew = new EntityWrapper< YaocaixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yaocaixinxi, "yaocaixinxi")); 
		YaocaixinxiView yaocaixinxiView =  yaocaixinxiService.selectView(ew);
		return R.ok("查询药材信息成功").put("data", yaocaixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        YaocaixinxiEntity yaocaixinxi = yaocaixinxiService.selectById(id);
        return R.ok().put("data", yaocaixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        YaocaixinxiEntity yaocaixinxi = yaocaixinxiService.selectById(id);
        return R.ok().put("data", yaocaixinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        YaocaixinxiEntity yaocaixinxi = yaocaixinxiService.selectById(id);
        if(type.equals("1")) {
        	yaocaixinxi.setThumbsupnum(yaocaixinxi.getThumbsupnum()+1);
        } else {
        	yaocaixinxi.setCrazilynum(yaocaixinxi.getCrazilynum()+1);
        }
        yaocaixinxiService.updateById(yaocaixinxi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YaocaixinxiEntity yaocaixinxi, HttpServletRequest request){
    	yaocaixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yaocaixinxi);

        yaocaixinxiService.insert(yaocaixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YaocaixinxiEntity yaocaixinxi, HttpServletRequest request){
    	yaocaixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yaocaixinxi);

        yaocaixinxiService.insert(yaocaixinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YaocaixinxiEntity yaocaixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yaocaixinxi);
        yaocaixinxiService.updateById(yaocaixinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yaocaixinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YaocaixinxiEntity> wrapper = new EntityWrapper<YaocaixinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yaocaixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
