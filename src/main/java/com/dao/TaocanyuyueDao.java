package com.dao;

import com.entity.TaocanyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TaocanyuyueVO;
import com.entity.view.TaocanyuyueView;


/**
 * 套餐预约
 * 
 * @author 
 * @email 
 * @date 2024-03-07 23:33:46
 */
public interface TaocanyuyueDao extends BaseMapper<TaocanyuyueEntity> {
	
	List<TaocanyuyueVO> selectListVO(@Param("ew") Wrapper<TaocanyuyueEntity> wrapper);
	
	TaocanyuyueVO selectVO(@Param("ew") Wrapper<TaocanyuyueEntity> wrapper);
	
	List<TaocanyuyueView> selectListView(@Param("ew") Wrapper<TaocanyuyueEntity> wrapper);

	List<TaocanyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<TaocanyuyueEntity> wrapper);

	
	TaocanyuyueView selectView(@Param("ew") Wrapper<TaocanyuyueEntity> wrapper);
	

}
