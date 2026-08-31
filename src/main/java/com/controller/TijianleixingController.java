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

import com.entity.TijianleixingEntity;
import com.entity.view.TijianleixingView;

import com.service.TijianleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 体检类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
@RestController
@RequestMapping("/tijianleixing")
public class TijianleixingController {
    @Autowired
    private TijianleixingService tijianleixingService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TijianleixingEntity tijianleixing,
		HttpServletRequest request){
        EntityWrapper<TijianleixingEntity> ew = new EntityWrapper<TijianleixingEntity>();

		PageUtils page = tijianleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tijianleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TijianleixingEntity tijianleixing, 
		HttpServletRequest request){
        EntityWrapper<TijianleixingEntity> ew = new EntityWrapper<TijianleixingEntity>();

		PageUtils page = tijianleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tijianleixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TijianleixingEntity tijianleixing){
       	EntityWrapper<TijianleixingEntity> ew = new EntityWrapper<TijianleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tijianleixing, "tijianleixing")); 
        return R.ok().put("data", tijianleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TijianleixingEntity tijianleixing){
        EntityWrapper< TijianleixingEntity> ew = new EntityWrapper< TijianleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tijianleixing, "tijianleixing")); 
		TijianleixingView tijianleixingView =  tijianleixingService.selectView(ew);
		return R.ok("查询体检类型成功").put("data", tijianleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TijianleixingEntity tijianleixing = tijianleixingService.selectById(id);
        return R.ok().put("data", tijianleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TijianleixingEntity tijianleixing = tijianleixingService.selectById(id);
        return R.ok().put("data", tijianleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TijianleixingEntity tijianleixing, HttpServletRequest request){
        if(tijianleixingService.selectCount(new EntityWrapper<TijianleixingEntity>().eq("tijianleixing", tijianleixing.getTijianleixing()))>0) {
            return R.error("体检类型已存在");
        }
    	//ValidatorUtils.validateEntity(tijianleixing);
        tijianleixingService.insert(tijianleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TijianleixingEntity tijianleixing, HttpServletRequest request){
        if(tijianleixingService.selectCount(new EntityWrapper<TijianleixingEntity>().eq("tijianleixing", tijianleixing.getTijianleixing()))>0) {
            return R.error("体检类型已存在");
        }
    	//ValidatorUtils.validateEntity(tijianleixing);
        tijianleixingService.insert(tijianleixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TijianleixingEntity tijianleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tijianleixing);
        if(tijianleixingService.selectCount(new EntityWrapper<TijianleixingEntity>().ne("id", tijianleixing.getId()).eq("tijianleixing", tijianleixing.getTijianleixing()))>0) {
            return R.error("体检类型已存在");
        }
        tijianleixingService.updateById(tijianleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tijianleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
