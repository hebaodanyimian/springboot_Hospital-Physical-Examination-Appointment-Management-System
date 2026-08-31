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


import com.dao.QuxiaotijianyuyueDao;
import com.entity.QuxiaotijianyuyueEntity;
import com.service.QuxiaotijianyuyueService;
import com.entity.vo.QuxiaotijianyuyueVO;
import com.entity.view.QuxiaotijianyuyueView;

@Service("quxiaotijianyuyueService")
public class QuxiaotijianyuyueServiceImpl extends ServiceImpl<QuxiaotijianyuyueDao, QuxiaotijianyuyueEntity> implements QuxiaotijianyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaotijianyuyueEntity> page = this.selectPage(
                new Query<QuxiaotijianyuyueEntity>(params).getPage(),
                new EntityWrapper<QuxiaotijianyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaotijianyuyueEntity> wrapper) {
		  Page<QuxiaotijianyuyueView> page =new Query<QuxiaotijianyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<QuxiaotijianyuyueVO> selectListVO(Wrapper<QuxiaotijianyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaotijianyuyueVO selectVO(Wrapper<QuxiaotijianyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaotijianyuyueView> selectListView(Wrapper<QuxiaotijianyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaotijianyuyueView selectView(Wrapper<QuxiaotijianyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
