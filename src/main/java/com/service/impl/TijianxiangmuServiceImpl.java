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


import com.dao.TijianxiangmuDao;
import com.entity.TijianxiangmuEntity;
import com.service.TijianxiangmuService;
import com.entity.vo.TijianxiangmuVO;
import com.entity.view.TijianxiangmuView;

@Service("tijianxiangmuService")
public class TijianxiangmuServiceImpl extends ServiceImpl<TijianxiangmuDao, TijianxiangmuEntity> implements TijianxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TijianxiangmuEntity> page = this.selectPage(
                new Query<TijianxiangmuEntity>(params).getPage(),
                new EntityWrapper<TijianxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TijianxiangmuEntity> wrapper) {
		  Page<TijianxiangmuView> page =new Query<TijianxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<TijianxiangmuVO> selectListVO(Wrapper<TijianxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TijianxiangmuVO selectVO(Wrapper<TijianxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TijianxiangmuView> selectListView(Wrapper<TijianxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TijianxiangmuView selectView(Wrapper<TijianxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
