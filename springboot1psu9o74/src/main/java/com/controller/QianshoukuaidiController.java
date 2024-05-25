package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.QianshoukuaidiEntity;
import com.entity.view.QianshoukuaidiView;

import com.service.QianshoukuaidiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 签收快递
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
@RestController
@RequestMapping("/qianshoukuaidi")
public class QianshoukuaidiController {
    @Autowired
    private QianshoukuaidiService qianshoukuaidiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QianshoukuaidiEntity qianshoukuaidi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			qianshoukuaidi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QianshoukuaidiEntity> ew = new EntityWrapper<QianshoukuaidiEntity>();

		PageUtils page = qianshoukuaidiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qianshoukuaidi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QianshoukuaidiEntity qianshoukuaidi, 
		HttpServletRequest request){
        EntityWrapper<QianshoukuaidiEntity> ew = new EntityWrapper<QianshoukuaidiEntity>();

		PageUtils page = qianshoukuaidiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qianshoukuaidi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QianshoukuaidiEntity qianshoukuaidi){
       	EntityWrapper<QianshoukuaidiEntity> ew = new EntityWrapper<QianshoukuaidiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qianshoukuaidi, "qianshoukuaidi")); 
        return R.ok().put("data", qianshoukuaidiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QianshoukuaidiEntity qianshoukuaidi){
        EntityWrapper< QianshoukuaidiEntity> ew = new EntityWrapper< QianshoukuaidiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qianshoukuaidi, "qianshoukuaidi")); 
		QianshoukuaidiView qianshoukuaidiView =  qianshoukuaidiService.selectView(ew);
		return R.ok("查询签收快递成功").put("data", qianshoukuaidiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QianshoukuaidiEntity qianshoukuaidi = qianshoukuaidiService.selectById(id);
        return R.ok().put("data", qianshoukuaidi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QianshoukuaidiEntity qianshoukuaidi = qianshoukuaidiService.selectById(id);
        return R.ok().put("data", qianshoukuaidi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QianshoukuaidiEntity qianshoukuaidi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(qianshoukuaidi);
        qianshoukuaidiService.insert(qianshoukuaidi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QianshoukuaidiEntity qianshoukuaidi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(qianshoukuaidi);
        qianshoukuaidiService.insert(qianshoukuaidi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QianshoukuaidiEntity qianshoukuaidi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qianshoukuaidi);
        qianshoukuaidiService.updateById(qianshoukuaidi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qianshoukuaidiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
