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

import com.entity.TaocanyuyueEntity;
import com.entity.view.TaocanyuyueView;

import com.service.TaocanyuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 套餐预约
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 23:33:46
 */
@RestController
@RequestMapping("/taocanyuyue")
public class TaocanyuyueController {
    @Autowired
    private TaocanyuyueService taocanyuyueService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TaocanyuyueEntity taocanyuyue,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			taocanyuyue.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TaocanyuyueEntity> ew = new EntityWrapper<TaocanyuyueEntity>();

		PageUtils page = taocanyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, taocanyuyue), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TaocanyuyueEntity taocanyuyue, 
		HttpServletRequest request){
        EntityWrapper<TaocanyuyueEntity> ew = new EntityWrapper<TaocanyuyueEntity>();

		PageUtils page = taocanyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, taocanyuyue), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TaocanyuyueEntity taocanyuyue){
       	EntityWrapper<TaocanyuyueEntity> ew = new EntityWrapper<TaocanyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( taocanyuyue, "taocanyuyue")); 
        return R.ok().put("data", taocanyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TaocanyuyueEntity taocanyuyue){
        EntityWrapper< TaocanyuyueEntity> ew = new EntityWrapper< TaocanyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( taocanyuyue, "taocanyuyue")); 
		TaocanyuyueView taocanyuyueView =  taocanyuyueService.selectView(ew);
		return R.ok("查询套餐预约成功").put("data", taocanyuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TaocanyuyueEntity taocanyuyue = taocanyuyueService.selectById(id);
        return R.ok().put("data", taocanyuyue);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TaocanyuyueEntity taocanyuyue = taocanyuyueService.selectById(id);
        return R.ok().put("data", taocanyuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TaocanyuyueEntity taocanyuyue, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(taocanyuyue);
        taocanyuyueService.insert(taocanyuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody TaocanyuyueEntity taocanyuyue, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(taocanyuyue);
        taocanyuyueService.insert(taocanyuyue);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TaocanyuyueEntity taocanyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(taocanyuyue);
        taocanyuyueService.updateById(taocanyuyue);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<TaocanyuyueEntity> list = new ArrayList<TaocanyuyueEntity>();
        for(Long id : ids) {
            TaocanyuyueEntity taocanyuyue = taocanyuyueService.selectById(id);
            taocanyuyue.setSfsh(sfsh);
            taocanyuyue.setShhf(shhf);
            list.add(taocanyuyue);
        }
        taocanyuyueService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        taocanyuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
