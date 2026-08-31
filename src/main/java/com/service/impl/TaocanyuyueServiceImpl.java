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


import com.dao.TaocanyuyueDao;
import com.entity.TaocanyuyueEntity;
import com.service.TaocanyuyueService;
import com.entity.vo.TaocanyuyueVO;
import com.entity.view.TaocanyuyueView;

@Service("taocanyuyueService")
public class TaocanyuyueServiceImpl extends ServiceImpl<TaocanyuyueDao, TaocanyuyueEntity> implements TaocanyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TaocanyuyueEntity> page = this.selectPage(
                new Query<TaocanyuyueEntity>(params).getPage(),
                new EntityWrapper<TaocanyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TaocanyuyueEntity> wrapper) {
		  Page<TaocanyuyueView> page =new Query<TaocanyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<TaocanyuyueVO> selectListVO(Wrapper<TaocanyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TaocanyuyueVO selectVO(Wrapper<TaocanyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TaocanyuyueView> selectListView(Wrapper<TaocanyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TaocanyuyueView selectView(Wrapper<TaocanyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
