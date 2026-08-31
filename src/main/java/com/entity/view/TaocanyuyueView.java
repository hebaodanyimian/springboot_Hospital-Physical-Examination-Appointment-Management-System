package com.entity.view;

import com.entity.TaocanyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 套餐预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-07 23:33:46
 */
@TableName("taocanyuyue")
public class TaocanyuyueView  extends TaocanyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TaocanyuyueView(){
	}
 
 	public TaocanyuyueView(TaocanyuyueEntity taocanyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, taocanyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
