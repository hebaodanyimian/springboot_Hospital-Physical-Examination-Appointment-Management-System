package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijianxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijianxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijianxiangmuView;


/**
 * 体检项目
 *
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
public interface TijianxiangmuService extends IService<TijianxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijianxiangmuVO> selectListVO(Wrapper<TijianxiangmuEntity> wrapper);
   	
   	TijianxiangmuVO selectVO(@Param("ew") Wrapper<TijianxiangmuEntity> wrapper);
   	
   	List<TijianxiangmuView> selectListView(Wrapper<TijianxiangmuEntity> wrapper);
   	
   	TijianxiangmuView selectView(@Param("ew") Wrapper<TijianxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijianxiangmuEntity> wrapper);

   	

}

