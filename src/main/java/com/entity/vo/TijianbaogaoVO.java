package com.entity.vo;

import com.entity.TijianbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 体检报告
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
public class TijianbaogaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 体检类型
	 */
	
	private String tijianleixing;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 体检报告
	 */
	
	private String tijianbaogao;
		
	/**
	 * 建议
	 */
	
	private String jianyi;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：项目名称
	 */
	 
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
				
	
	/**
	 * 设置：体检类型
	 */
	 
	public void setTijianleixing(String tijianleixing) {
		this.tijianleixing = tijianleixing;
	}
	
	/**
	 * 获取：体检类型
	 */
	public String getTijianleixing() {
		return tijianleixing;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：体检报告
	 */
	 
	public void setTijianbaogao(String tijianbaogao) {
		this.tijianbaogao = tijianbaogao;
	}
	
	/**
	 * 获取：体检报告
	 */
	public String getTijianbaogao() {
		return tijianbaogao;
	}
				
	
	/**
	 * 设置：建议
	 */
	 
	public void setJianyi(String jianyi) {
		this.jianyi = jianyi;
	}
	
	/**
	 * 获取：建议
	 */
	public String getJianyi() {
		return jianyi;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
