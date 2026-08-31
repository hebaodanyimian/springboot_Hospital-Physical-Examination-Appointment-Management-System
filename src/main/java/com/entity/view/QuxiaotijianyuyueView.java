package com.entity.view;

import com.entity.QuxiaotijianyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 取消体检预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
@TableName("quxiaotijianyuyue")
public class QuxiaotijianyuyueView  extends QuxiaotijianyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuxiaotijianyuyueView(){
	}
 
 	public QuxiaotijianyuyueView(QuxiaotijianyuyueEntity quxiaotijianyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, quxiaotijianyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
