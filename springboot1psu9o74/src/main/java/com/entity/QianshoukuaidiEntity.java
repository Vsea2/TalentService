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
 * 签收快递
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
@TableName("qianshoukuaidi")
public class QianshoukuaidiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QianshoukuaidiEntity() {
		
	}
	
	public QianshoukuaidiEntity(T t) {
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
	 * 快递单号
	 */
					
	private String kuaididanhao;
	
	/**
	 * 快递名称
	 */
					
	private String kuaidimingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 快递类型
	 */
					
	private String kuaidileixing;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 存放地址
	 */
					
	private String cunfangdizhi;
	
	/**
	 * 快递简介
	 */
					
	private String kuaidijianjie;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
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
	 * 设置：快递单号
	 */
	public void setKuaididanhao(String kuaididanhao) {
		this.kuaididanhao = kuaididanhao;
	}
	/**
	 * 获取：快递单号
	 */
	public String getKuaididanhao() {
		return kuaididanhao;
	}
	/**
	 * 设置：快递名称
	 */
	public void setKuaidimingcheng(String kuaidimingcheng) {
		this.kuaidimingcheng = kuaidimingcheng;
	}
	/**
	 * 获取：快递名称
	 */
	public String getKuaidimingcheng() {
		return kuaidimingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：快递类型
	 */
	public void setKuaidileixing(String kuaidileixing) {
		this.kuaidileixing = kuaidileixing;
	}
	/**
	 * 获取：快递类型
	 */
	public String getKuaidileixing() {
		return kuaidileixing;
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
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：存放地址
	 */
	public void setCunfangdizhi(String cunfangdizhi) {
		this.cunfangdizhi = cunfangdizhi;
	}
	/**
	 * 获取：存放地址
	 */
	public String getCunfangdizhi() {
		return cunfangdizhi;
	}
	/**
	 * 设置：快递简介
	 */
	public void setKuaidijianjie(String kuaidijianjie) {
		this.kuaidijianjie = kuaidijianjie;
	}
	/**
	 * 获取：快递简介
	 */
	public String getKuaidijianjie() {
		return kuaidijianjie;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
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
