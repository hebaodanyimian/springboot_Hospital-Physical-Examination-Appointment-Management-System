package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijianleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijianleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijianleixingView;


/**
 * 体检类型
 *
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
public interface TijianleixingService extends IService<TijianleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijianleixingVO> selectListVO(Wrapper<TijianleixingEntity> wrapper);
   	
   	TijianleixingVO selectVO(@Param("ew") Wrapper<TijianleixingEntity> wrapper);
   	
   	List<TijianleixingView> selectListView(Wrapper<TijianleixingEntity> wrapper);
   	
   	TijianleixingView selectView(@Param("ew") Wrapper<TijianleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijianleixingEntity> wrapper);

   	

}

