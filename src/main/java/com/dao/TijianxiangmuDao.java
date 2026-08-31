package com.dao;

import com.entity.TijianxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TijianxiangmuVO;
import com.entity.view.TijianxiangmuView;


/**
 * 体检项目
 * 
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
public interface TijianxiangmuDao extends BaseMapper<TijianxiangmuEntity> {
	
	List<TijianxiangmuVO> selectListVO(@Param("ew") Wrapper<TijianxiangmuEntity> wrapper);
	
	TijianxiangmuVO selectVO(@Param("ew") Wrapper<TijianxiangmuEntity> wrapper);
	
	List<TijianxiangmuView> selectListView(@Param("ew") Wrapper<TijianxiangmuEntity> wrapper);

	List<TijianxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<TijianxiangmuEntity> wrapper);

	
	TijianxiangmuView selectView(@Param("ew") Wrapper<TijianxiangmuEntity> wrapper);
	

}
