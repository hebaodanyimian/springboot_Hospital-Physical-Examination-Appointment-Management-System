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


import com.dao.QuxiaotaocanyuyueDao;
import com.entity.QuxiaotaocanyuyueEntity;
import com.service.QuxiaotaocanyuyueService;
import com.entity.vo.QuxiaotaocanyuyueVO;
import com.entity.view.QuxiaotaocanyuyueView;

@Service("quxiaotaocanyuyueService")
public class QuxiaotaocanyuyueServiceImpl extends ServiceImpl<QuxiaotaocanyuyueDao, QuxiaotaocanyuyueEntity> implements QuxiaotaocanyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaotaocanyuyueEntity> page = this.selectPage(
                new Query<QuxiaotaocanyuyueEntity>(params).getPage(),
                new EntityWrapper<QuxiaotaocanyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaotaocanyuyueEntity> wrapper) {
		  Page<QuxiaotaocanyuyueView> page =new Query<QuxiaotaocanyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<QuxiaotaocanyuyueVO> selectListVO(Wrapper<QuxiaotaocanyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaotaocanyuyueVO selectVO(Wrapper<QuxiaotaocanyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaotaocanyuyueView> selectListView(Wrapper<QuxiaotaocanyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaotaocanyuyueView selectView(Wrapper<QuxiaotaocanyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
