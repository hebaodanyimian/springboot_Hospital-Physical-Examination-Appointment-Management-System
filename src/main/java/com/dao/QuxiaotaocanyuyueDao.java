package com.dao;

import com.entity.QuxiaotaocanyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaotaocanyuyueVO;
import com.entity.view.QuxiaotaocanyuyueView;


/**
 * 取消套餐预约
 * 
 * @author 
 * @email 
 * @date 2024-03-07 23:33:46
 */
public interface QuxiaotaocanyuyueDao extends BaseMapper<QuxiaotaocanyuyueEntity> {
	
	List<QuxiaotaocanyuyueVO> selectListVO(@Param("ew") Wrapper<QuxiaotaocanyuyueEntity> wrapper);
	
	QuxiaotaocanyuyueVO selectVO(@Param("ew") Wrapper<QuxiaotaocanyuyueEntity> wrapper);
	
	List<QuxiaotaocanyuyueView> selectListView(@Param("ew") Wrapper<QuxiaotaocanyuyueEntity> wrapper);

	List<QuxiaotaocanyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaotaocanyuyueEntity> wrapper);

	
	QuxiaotaocanyuyueView selectView(@Param("ew") Wrapper<QuxiaotaocanyuyueEntity> wrapper);
	

}
