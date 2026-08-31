package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 体检报告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-07 23:33:45
 */
@TableName("tijianbaogao")
public class TijianbaogaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TijianbaogaoEntity() {
		
	}
	
	public TijianbaogaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 报告单号
	 */
					
	private String baogaodanhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：报告单号
	 */
	public void setBaogaodanhao(String baogaodanhao) {
		this.baogaodanhao = baogaodanhao;
	}
	/**
	 * 获取：报告单号
	 */
	public String getBaogaodanhao() {
		return baogaodanhao;
	}
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
