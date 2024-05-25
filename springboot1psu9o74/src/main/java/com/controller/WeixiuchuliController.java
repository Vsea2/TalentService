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

import com.entity.WeixiuchuliEntity;
import com.entity.view.WeixiuchuliView;

import com.service.WeixiuchuliService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 维修处理
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
@RestController
@RequestMapping("/weixiuchuli")
public class WeixiuchuliController {
    @Autowired
    private WeixiuchuliService weixiuchuliService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WeixiuchuliEntity weixiuchuli,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			weixiuchuli.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WeixiuchuliEntity> ew = new EntityWrapper<WeixiuchuliEntity>();

		PageUtils page = weixiuchuliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weixiuchuli), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WeixiuchuliEntity weixiuchuli, 
		HttpServletRequest request){
        EntityWrapper<WeixiuchuliEntity> ew = new EntityWrapper<WeixiuchuliEntity>();

		PageUtils page = weixiuchuliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weixiuchuli), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WeixiuchuliEntity weixiuchuli){
       	EntityWrapper<WeixiuchuliEntity> ew = new EntityWrapper<WeixiuchuliEntity>();
      	ew.allEq(MPUtil.allEQMapPre( weixiuchuli, "weixiuchuli")); 
        return R.ok().put("data", weixiuchuliService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WeixiuchuliEntity weixiuchuli){
        EntityWrapper< WeixiuchuliEntity> ew = new EntityWrapper< WeixiuchuliEntity>();
 		ew.allEq(MPUtil.allEQMapPre( weixiuchuli, "weixiuchuli")); 
		WeixiuchuliView weixiuchuliView =  weixiuchuliService.selectView(ew);
		return R.ok("查询维修处理成功").put("data", weixiuchuliView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WeixiuchuliEntity weixiuchuli = weixiuchuliService.selectById(id);
        return R.ok().put("data", weixiuchuli);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WeixiuchuliEntity weixiuchuli = weixiuchuliService.selectById(id);
        return R.ok().put("data", weixiuchuli);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WeixiuchuliEntity weixiuchuli, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(weixiuchuli);
        weixiuchuliService.insert(weixiuchuli);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WeixiuchuliEntity weixiuchuli, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(weixiuchuli);
        weixiuchuliService.insert(weixiuchuli);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WeixiuchuliEntity weixiuchuli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(weixiuchuli);
        weixiuchuliService.updateById(weixiuchuli);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        weixiuchuliService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
