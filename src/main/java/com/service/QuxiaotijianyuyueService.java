package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaotijianyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaotijianyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaotijianyuyueView;


/**
 * 取消体检预约
 *
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
public interface QuxiaotijianyuyueService extends IService<QuxiaotijianyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaotijianyuyueVO> selectListVO(Wrapper<QuxiaotijianyuyueEntity> wrapper);
   	
   	QuxiaotijianyuyueVO selectVO(@Param("ew") Wrapper<QuxiaotijianyuyueEntity> wrapper);
   	
   	List<QuxiaotijianyuyueView> selectListView(Wrapper<QuxiaotijianyuyueEntity> wrapper);
   	
   	QuxiaotijianyuyueView selectView(@Param("ew") Wrapper<QuxiaotijianyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaotijianyuyueEntity> wrapper);

   	

}

