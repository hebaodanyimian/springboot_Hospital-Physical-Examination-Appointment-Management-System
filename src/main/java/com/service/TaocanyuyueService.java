package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TaocanyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TaocanyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TaocanyuyueView;


/**
 * 套餐预约
 *
 * @author 
 * @email 
 * @date 2024-03-07 23:33:46
 */
public interface TaocanyuyueService extends IService<TaocanyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TaocanyuyueVO> selectListVO(Wrapper<TaocanyuyueEntity> wrapper);
   	
   	TaocanyuyueVO selectVO(@Param("ew") Wrapper<TaocanyuyueEntity> wrapper);
   	
   	List<TaocanyuyueView> selectListView(Wrapper<TaocanyuyueEntity> wrapper);
   	
   	TaocanyuyueView selectView(@Param("ew") Wrapper<TaocanyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TaocanyuyueEntity> wrapper);

   	

}

