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


import com.dao.TijianleixingDao;
import com.entity.TijianleixingEntity;
import com.service.TijianleixingService;
import com.entity.vo.TijianleixingVO;
import com.entity.view.TijianleixingView;

@Service("tijianleixingService")
public class TijianleixingServiceImpl extends ServiceImpl<TijianleixingDao, TijianleixingEntity> implements TijianleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TijianleixingEntity> page = this.selectPage(
                new Query<TijianleixingEntity>(params).getPage(),
                new EntityWrapper<TijianleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TijianleixingEntity> wrapper) {
		  Page<TijianleixingView> page =new Query<TijianleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<TijianleixingVO> selectListVO(Wrapper<TijianleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TijianleixingVO selectVO(Wrapper<TijianleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TijianleixingView> selectListView(Wrapper<TijianleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TijianleixingView selectView(Wrapper<TijianleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
