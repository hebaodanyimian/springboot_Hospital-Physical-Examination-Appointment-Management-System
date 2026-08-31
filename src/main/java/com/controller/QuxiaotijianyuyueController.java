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

import com.entity.QuxiaotijianyuyueEntity;
import com.entity.view.QuxiaotijianyuyueView;

import com.service.QuxiaotijianyuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 取消体检预约
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
@RestController
@RequestMapping("/quxiaotijianyuyue")
public class QuxiaotijianyuyueController {
    @Autowired
    private QuxiaotijianyuyueService quxiaotijianyuyueService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuxiaotijianyuyueEntity quxiaotijianyuyue,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			quxiaotijianyuyue.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QuxiaotijianyuyueEntity> ew = new EntityWrapper<QuxiaotijianyuyueEntity>();

		PageUtils page = quxiaotijianyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaotijianyuyue), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QuxiaotijianyuyueEntity quxiaotijianyuyue, 
		HttpServletRequest request){
        EntityWrapper<QuxiaotijianyuyueEntity> ew = new EntityWrapper<QuxiaotijianyuyueEntity>();

		PageUtils page = quxiaotijianyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaotijianyuyue), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuxiaotijianyuyueEntity quxiaotijianyuyue){
       	EntityWrapper<QuxiaotijianyuyueEntity> ew = new EntityWrapper<QuxiaotijianyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quxiaotijianyuyue, "quxiaotijianyuyue")); 
        return R.ok().put("data", quxiaotijianyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuxiaotijianyuyueEntity quxiaotijianyuyue){
        EntityWrapper< QuxiaotijianyuyueEntity> ew = new EntityWrapper< QuxiaotijianyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quxiaotijianyuyue, "quxiaotijianyuyue")); 
		QuxiaotijianyuyueView quxiaotijianyuyueView =  quxiaotijianyuyueService.selectView(ew);
		return R.ok("查询取消体检预约成功").put("data", quxiaotijianyuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QuxiaotijianyuyueEntity quxiaotijianyuyue = quxiaotijianyuyueService.selectById(id);
        return R.ok().put("data", quxiaotijianyuyue);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QuxiaotijianyuyueEntity quxiaotijianyuyue = quxiaotijianyuyueService.selectById(id);
        return R.ok().put("data", quxiaotijianyuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QuxiaotijianyuyueEntity quxiaotijianyuyue, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(quxiaotijianyuyue);
        quxiaotijianyuyueService.insert(quxiaotijianyuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody QuxiaotijianyuyueEntity quxiaotijianyuyue, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(quxiaotijianyuyue);
        quxiaotijianyuyueService.insert(quxiaotijianyuyue);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QuxiaotijianyuyueEntity quxiaotijianyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaotijianyuyue);
        quxiaotijianyuyueService.updateById(quxiaotijianyuyue);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<QuxiaotijianyuyueEntity> list = new ArrayList<QuxiaotijianyuyueEntity>();
        for(Long id : ids) {
            QuxiaotijianyuyueEntity quxiaotijianyuyue = quxiaotijianyuyueService.selectById(id);
            quxiaotijianyuyue.setSfsh(sfsh);
            quxiaotijianyuyue.setShhf(shhf);
            list.add(quxiaotijianyuyue);
        }
        quxiaotijianyuyueService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        quxiaotijianyuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
