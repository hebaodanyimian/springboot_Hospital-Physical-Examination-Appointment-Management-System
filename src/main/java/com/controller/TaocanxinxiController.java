package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TaocanxinxiEntity;
import com.entity.view.TaocanxinxiView;

import com.service.TaocanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 套餐信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
@RestController
@RequestMapping("/taocanxinxi")
public class TaocanxinxiController {
    @Autowired
    private TaocanxinxiService taocanxinxiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TaocanxinxiEntity taocanxinxi,
		HttpServletRequest request){
        EntityWrapper<TaocanxinxiEntity> ew = new EntityWrapper<TaocanxinxiEntity>();

		PageUtils page = taocanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, taocanxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TaocanxinxiEntity taocanxinxi, 
		HttpServletRequest request){
        EntityWrapper<TaocanxinxiEntity> ew = new EntityWrapper<TaocanxinxiEntity>();

		PageUtils page = taocanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, taocanxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TaocanxinxiEntity taocanxinxi){
       	EntityWrapper<TaocanxinxiEntity> ew = new EntityWrapper<TaocanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( taocanxinxi, "taocanxinxi")); 
        return R.ok().put("data", taocanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TaocanxinxiEntity taocanxinxi){
        EntityWrapper< TaocanxinxiEntity> ew = new EntityWrapper< TaocanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( taocanxinxi, "taocanxinxi")); 
		TaocanxinxiView taocanxinxiView =  taocanxinxiService.selectView(ew);
		return R.ok("查询套餐信息成功").put("data", taocanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TaocanxinxiEntity taocanxinxi = taocanxinxiService.selectById(id);
		taocanxinxi.setClicknum(taocanxinxi.getClicknum()+1);
		taocanxinxi.setClicktime(new Date());
		taocanxinxiService.updateById(taocanxinxi);
        taocanxinxi = taocanxinxiService.selectView(new EntityWrapper<TaocanxinxiEntity>().eq("id", id));
        return R.ok().put("data", taocanxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TaocanxinxiEntity taocanxinxi = taocanxinxiService.selectById(id);
		taocanxinxi.setClicknum(taocanxinxi.getClicknum()+1);
		taocanxinxi.setClicktime(new Date());
		taocanxinxiService.updateById(taocanxinxi);
        taocanxinxi = taocanxinxiService.selectView(new EntityWrapper<TaocanxinxiEntity>().eq("id", id));
        return R.ok().put("data", taocanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TaocanxinxiEntity taocanxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(taocanxinxi);
        taocanxinxiService.insert(taocanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody TaocanxinxiEntity taocanxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(taocanxinxi);
        taocanxinxiService.insert(taocanxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TaocanxinxiEntity taocanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(taocanxinxi);
        taocanxinxiService.updateById(taocanxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        taocanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,TaocanxinxiEntity taocanxinxi, HttpServletRequest request,String pre){
        EntityWrapper<TaocanxinxiEntity> ew = new EntityWrapper<TaocanxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = taocanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, taocanxinxi), params), params));
        return R.ok().put("data", page);
    }










}
