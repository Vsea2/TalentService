package com.entity.vo;

import com.entity.WeixiuchuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 维修处理
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
public class WeixiuchuliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
