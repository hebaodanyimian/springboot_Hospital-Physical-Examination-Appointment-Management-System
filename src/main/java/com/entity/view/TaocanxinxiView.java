package com.entity.view;

import com.entity.TaocanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 套餐信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
@TableName("taocanxinxi")
public class TaocanxinxiView  extends TaocanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TaocanxinxiView(){
	}
 
 	public TaocanxinxiView(TaocanxinxiEntity taocanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, taocanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
