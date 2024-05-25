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
 * 维修处理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
@TableName("weixiuchuli")
public class WeixiuchuliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeixiuchuliEntity() {
		
	}
	
	public WeixiuchuliEntity(T t) {
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
	 * 维修单号
	 */
					
	private String weixiudanhao;
	
	/**
	 * 处理照片
	 */
					
	private String chulizhaopian;
	
	/**
	 * 地址
	 */
					
	private String dizhi;
	
	/**
	 * 报修名称
	 */
					
	private String baoxiumingcheng;
	
	/**
	 * 报修回复
	 */
					
	private String baoxiuhuifu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
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
	 * 设置：维修单号
	 */
	public void setWeixiudanhao(String weixiudanhao) {
		this.weixiudanhao = weixiudanhao;
	}
	/**
	 * 获取：维修单号
	 */
	public String getWeixiudanhao() {
		return weixiudanhao;
	}
	/**
	 * 设置：处理照片
	 */
	public void setChulizhaopian(String chulizhaopian) {
		this.chulizhaopian = chulizhaopian;
	}
	/**
	 * 获取：处理照片
	 */
	public String getChulizhaopian() {
		return chulizhaopian;
	}
	/**
	 * 设置：地址
	 */
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
	/**
	 * 设置：报修名称
	 */
	public void setBaoxiumingcheng(String baoxiumingcheng) {
		this.baoxiumingcheng = baoxiumingcheng;
	}
	/**
	 * 获取：报修名称
	 */
	public String getBaoxiumingcheng() {
		return baoxiumingcheng;
	}
	/**
	 * 设置：报修回复
	 */
	public void setBaoxiuhuifu(String baoxiuhuifu) {
		this.baoxiuhuifu = baoxiuhuifu;
	}
	/**
	 * 获取：报修回复
	 */
	public String getBaoxiuhuifu() {
		return baoxiuhuifu;
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
