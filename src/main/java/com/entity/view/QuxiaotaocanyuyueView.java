package com.entity.view;

import com.entity.QuxiaotaocanyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 取消套餐预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-07 23:33:46
 */
@TableName("quxiaotaocanyuyue")
public class QuxiaotaocanyuyueView  extends QuxiaotaocanyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuxiaotaocanyuyueView(){
	}
 
 	public QuxiaotaocanyuyueView(QuxiaotaocanyuyueEntity quxiaotaocanyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, quxiaotaocanyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
