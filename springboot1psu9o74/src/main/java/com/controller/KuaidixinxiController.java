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

import com.entity.KuaidixinxiEntity;
import com.entity.view.KuaidixinxiView;

import com.service.KuaidixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 快递信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
@RestController
@RequestMapping("/kuaidixinxi")
public class KuaidixinxiController {
    @Autowired
    private KuaidixinxiService kuaidixinxiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KuaidixinxiEntity kuaidixinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			kuaidixinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KuaidixinxiEntity> ew = new EntityWrapper<KuaidixinxiEntity>();

		PageUtils page = kuaidixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kuaidixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KuaidixinxiEntity kuaidixinxi, 
		HttpServletRequest request){
        EntityWrapper<KuaidixinxiEntity> ew = new EntityWrapper<KuaidixinxiEntity>();

		PageUtils page = kuaidixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kuaidixinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KuaidixinxiEntity kuaidixinxi){
       	EntityWrapper<KuaidixinxiEntity> ew = new EntityWrapper<KuaidixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kuaidixinxi, "kuaidixinxi")); 
        return R.ok().put("data", kuaidixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KuaidixinxiEntity kuaidixinxi){
        EntityWrapper< KuaidixinxiEntity> ew = new EntityWrapper< KuaidixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kuaidixinxi, "kuaidixinxi")); 
		KuaidixinxiView kuaidixinxiView =  kuaidixinxiService.selectView(ew);
		return R.ok("查询快递信息成功").put("data", kuaidixinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KuaidixinxiEntity kuaidixinxi = kuaidixinxiService.selectById(id);
        return R.ok().put("data", kuaidixinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KuaidixinxiEntity kuaidixinxi = kuaidixinxiService.selectById(id);
        return R.ok().put("data", kuaidixinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KuaidixinxiEntity kuaidixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kuaidixinxi);
        kuaidixinxiService.insert(kuaidixinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KuaidixinxiEntity kuaidixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kuaidixinxi);
        kuaidixinxiService.insert(kuaidixinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KuaidixinxiEntity kuaidixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kuaidixinxi);
        kuaidixinxiService.updateById(kuaidixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kuaidixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
