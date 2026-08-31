package com.dao;

import com.entity.TijianleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TijianleixingVO;
import com.entity.view.TijianleixingView;


/**
 * 体检类型
 * 
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
public interface TijianleixingDao extends BaseMapper<TijianleixingEntity> {
	
	List<TijianleixingVO> selectListVO(@Param("ew") Wrapper<TijianleixingEntity> wrapper);
	
	TijianleixingVO selectVO(@Param("ew") Wrapper<TijianleixingEntity> wrapper);
	
	List<TijianleixingView> selectListView(@Param("ew") Wrapper<TijianleixingEntity> wrapper);

	List<TijianleixingView> selectListView(Pagination page,@Param("ew") Wrapper<TijianleixingEntity> wrapper);

	
	TijianleixingView selectView(@Param("ew") Wrapper<TijianleixingEntity> wrapper);
	

}
