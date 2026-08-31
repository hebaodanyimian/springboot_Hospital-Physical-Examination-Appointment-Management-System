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

import com.entity.TaocanleixingEntity;
import com.entity.view.TaocanleixingView;

import com.service.TaocanleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 套餐类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
@RestController
@RequestMapping("/taocanleixing")
public class TaocanleixingController {
    @Autowired
    private TaocanleixingService taocanleixingService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TaocanleixingEntity taocanleixing,
		HttpServletRequest request){
        EntityWrapper<TaocanleixingEntity> ew = new EntityWrapper<TaocanleixingEntity>();

		PageUtils page = taocanleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, taocanleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TaocanleixingEntity taocanleixing, 
		HttpServletRequest request){
        EntityWrapper<TaocanleixingEntity> ew = new EntityWrapper<TaocanleixingEntity>();

		PageUtils page = taocanleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, taocanleixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TaocanleixingEntity taocanleixing){
       	EntityWrapper<TaocanleixingEntity> ew = new EntityWrapper<TaocanleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( taocanleixing, "taocanleixing")); 
        return R.ok().put("data", taocanleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TaocanleixingEntity taocanleixing){
        EntityWrapper< TaocanleixingEntity> ew = new EntityWrapper< TaocanleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( taocanleixing, "taocanleixing")); 
		TaocanleixingView taocanleixingView =  taocanleixingService.selectView(ew);
		return R.ok("查询套餐类型成功").put("data", taocanleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TaocanleixingEntity taocanleixing = taocanleixingService.selectById(id);
        return R.ok().put("data", taocanleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TaocanleixingEntity taocanleixing = taocanleixingService.selectById(id);
        return R.ok().put("data", taocanleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TaocanleixingEntity taocanleixing, HttpServletRequest request){
        if(taocanleixingService.selectCount(new EntityWrapper<TaocanleixingEntity>().eq("taocanleixing", taocanleixing.getTaocanleixing()))>0) {
            return R.error("套餐类型已存在");
        }
    	//ValidatorUtils.validateEntity(taocanleixing);
        taocanleixingService.insert(taocanleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TaocanleixingEntity taocanleixing, HttpServletRequest request){
        if(taocanleixingService.selectCount(new EntityWrapper<TaocanleixingEntity>().eq("taocanleixing", taocanleixing.getTaocanleixing()))>0) {
            return R.error("套餐类型已存在");
        }
    	//ValidatorUtils.validateEntity(taocanleixing);
        taocanleixingService.insert(taocanleixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TaocanleixingEntity taocanleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(taocanleixing);
        if(taocanleixingService.selectCount(new EntityWrapper<TaocanleixingEntity>().ne("id", taocanleixing.getId()).eq("taocanleixing", taocanleixing.getTaocanleixing()))>0) {
            return R.error("套餐类型已存在");
        }
        taocanleixingService.updateById(taocanleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        taocanleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
