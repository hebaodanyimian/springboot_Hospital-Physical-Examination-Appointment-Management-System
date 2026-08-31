package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaotaocanyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaotaocanyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaotaocanyuyueView;


/**
 * 取消套餐预约
 *
 * @author 
 * @email 
 * @date 2024-03-07 23:33:46
 */
public interface QuxiaotaocanyuyueService extends IService<QuxiaotaocanyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaotaocanyuyueVO> selectListVO(Wrapper<QuxiaotaocanyuyueEntity> wrapper);
   	
   	QuxiaotaocanyuyueVO selectVO(@Param("ew") Wrapper<QuxiaotaocanyuyueEntity> wrapper);
   	
   	List<QuxiaotaocanyuyueView> selectListView(Wrapper<QuxiaotaocanyuyueEntity> wrapper);
   	
   	QuxiaotaocanyuyueView selectView(@Param("ew") Wrapper<QuxiaotaocanyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaotaocanyuyueEntity> wrapper);

   	

}

