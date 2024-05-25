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

import com.entity.ShequgonggaoEntity;
import com.entity.view.ShequgonggaoView;

import com.service.ShequgonggaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 社区公告
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
@RestController
@RequestMapping("/shequgonggao")
public class ShequgonggaoController {
    @Autowired
    private ShequgonggaoService shequgonggaoService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShequgonggaoEntity shequgonggao,
		HttpServletRequest request){
        EntityWrapper<ShequgonggaoEntity> ew = new EntityWrapper<ShequgonggaoEntity>();

		PageUtils page = shequgonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequgonggao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShequgonggaoEntity shequgonggao, 
		HttpServletRequest request){
        EntityWrapper<ShequgonggaoEntity> ew = new EntityWrapper<ShequgonggaoEntity>();

		PageUtils page = shequgonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequgonggao), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShequgonggaoEntity shequgonggao){
       	EntityWrapper<ShequgonggaoEntity> ew = new EntityWrapper<ShequgonggaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shequgonggao, "shequgonggao")); 
        return R.ok().put("data", shequgonggaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShequgonggaoEntity shequgonggao){
        EntityWrapper< ShequgonggaoEntity> ew = new EntityWrapper< ShequgonggaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shequgonggao, "shequgonggao")); 
		ShequgonggaoView shequgonggaoView =  shequgonggaoService.selectView(ew);
		return R.ok("查询社区公告成功").put("data", shequgonggaoView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShequgonggaoEntity shequgonggao = shequgonggaoService.selectById(id);
        return R.ok().put("data", shequgonggao);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShequgonggaoEntity shequgonggao = shequgonggaoService.selectById(id);
        return R.ok().put("data", shequgonggao);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShequgonggaoEntity shequgonggao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shequgonggao);
        shequgonggaoService.insert(shequgonggao);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShequgonggaoEntity shequgonggao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shequgonggao);
        shequgonggaoService.insert(shequgonggao);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShequgonggaoEntity shequgonggao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shequgonggao);
        shequgonggaoService.updateById(shequgonggao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shequgonggaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
