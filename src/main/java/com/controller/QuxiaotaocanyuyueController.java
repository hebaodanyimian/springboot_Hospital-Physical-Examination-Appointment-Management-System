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

import com.entity.QuxiaotaocanyuyueEntity;
import com.entity.view.QuxiaotaocanyuyueView;

import com.service.QuxiaotaocanyuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 取消套餐预约
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 23:33:46
 */
@RestController
@RequestMapping("/quxiaotaocanyuyue")
public class QuxiaotaocanyuyueController {
    @Autowired
    private QuxiaotaocanyuyueService quxiaotaocanyuyueService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuxiaotaocanyuyueEntity quxiaotaocanyuyue,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			quxiaotaocanyuyue.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QuxiaotaocanyuyueEntity> ew = new EntityWrapper<QuxiaotaocanyuyueEntity>();

		PageUtils page = quxiaotaocanyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaotaocanyuyue), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QuxiaotaocanyuyueEntity quxiaotaocanyuyue, 
		HttpServletRequest request){
        EntityWrapper<QuxiaotaocanyuyueEntity> ew = new EntityWrapper<QuxiaotaocanyuyueEntity>();

		PageUtils page = quxiaotaocanyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaotaocanyuyue), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuxiaotaocanyuyueEntity quxiaotaocanyuyue){
       	EntityWrapper<QuxiaotaocanyuyueEntity> ew = new EntityWrapper<QuxiaotaocanyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quxiaotaocanyuyue, "quxiaotaocanyuyue")); 
        return R.ok().put("data", quxiaotaocanyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuxiaotaocanyuyueEntity quxiaotaocanyuyue){
        EntityWrapper< QuxiaotaocanyuyueEntity> ew = new EntityWrapper< QuxiaotaocanyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quxiaotaocanyuyue, "quxiaotaocanyuyue")); 
		QuxiaotaocanyuyueView quxiaotaocanyuyueView =  quxiaotaocanyuyueService.selectView(ew);
		return R.ok("查询取消套餐预约成功").put("data", quxiaotaocanyuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QuxiaotaocanyuyueEntity quxiaotaocanyuyue = quxiaotaocanyuyueService.selectById(id);
        return R.ok().put("data", quxiaotaocanyuyue);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QuxiaotaocanyuyueEntity quxiaotaocanyuyue = quxiaotaocanyuyueService.selectById(id);
        return R.ok().put("data", quxiaotaocanyuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QuxiaotaocanyuyueEntity quxiaotaocanyuyue, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(quxiaotaocanyuyue);
        quxiaotaocanyuyueService.insert(quxiaotaocanyuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody QuxiaotaocanyuyueEntity quxiaotaocanyuyue, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(quxiaotaocanyuyue);
        quxiaotaocanyuyueService.insert(quxiaotaocanyuyue);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QuxiaotaocanyuyueEntity quxiaotaocanyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaotaocanyuyue);
        quxiaotaocanyuyueService.updateById(quxiaotaocanyuyue);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<QuxiaotaocanyuyueEntity> list = new ArrayList<QuxiaotaocanyuyueEntity>();
        for(Long id : ids) {
            QuxiaotaocanyuyueEntity quxiaotaocanyuyue = quxiaotaocanyuyueService.selectById(id);
            quxiaotaocanyuyue.setSfsh(sfsh);
            quxiaotaocanyuyue.setShhf(shhf);
            list.add(quxiaotaocanyuyue);
        }
        quxiaotaocanyuyueService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        quxiaotaocanyuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
