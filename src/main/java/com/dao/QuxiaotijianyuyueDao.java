package com.dao;

import com.entity.QuxiaotijianyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaotijianyuyueVO;
import com.entity.view.QuxiaotijianyuyueView;


/**
 * 取消体检预约
 * 
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
public interface QuxiaotijianyuyueDao extends BaseMapper<QuxiaotijianyuyueEntity> {
	
	List<QuxiaotijianyuyueVO> selectListVO(@Param("ew") Wrapper<QuxiaotijianyuyueEntity> wrapper);
	
	QuxiaotijianyuyueVO selectVO(@Param("ew") Wrapper<QuxiaotijianyuyueEntity> wrapper);
	
	List<QuxiaotijianyuyueView> selectListView(@Param("ew") Wrapper<QuxiaotijianyuyueEntity> wrapper);

	List<QuxiaotijianyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaotijianyuyueEntity> wrapper);

	
	QuxiaotijianyuyueView selectView(@Param("ew") Wrapper<QuxiaotijianyuyueEntity> wrapper);
	

}
