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

import com.entity.ShequguanliyuanEntity;
import com.entity.view.ShequguanliyuanView;

import com.service.ShequguanliyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 社区管理员
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
@RestController
@RequestMapping("/shequguanliyuan")
public class ShequguanliyuanController {
    @Autowired
    private ShequguanliyuanService shequguanliyuanService;




    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		ShequguanliyuanEntity u = shequguanliyuanService.selectOne(new EntityWrapper<ShequguanliyuanEntity>().eq("guanliyuanhao", username));
		if(u==null || !u.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(u.getId(), username,"shequguanliyuan",  "管理员" );
		return R.ok().put("token", token);
	}


	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody ShequguanliyuanEntity shequguanliyuan){
    	//ValidatorUtils.validateEntity(shequguanliyuan);
    	ShequguanliyuanEntity u = shequguanliyuanService.selectOne(new EntityWrapper<ShequguanliyuanEntity>().eq("guanliyuanhao", shequguanliyuan.getGuanliyuanhao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		shequguanliyuan.setId(uId);
        shequguanliyuanService.insert(shequguanliyuan);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        ShequguanliyuanEntity u = shequguanliyuanService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	ShequguanliyuanEntity u = shequguanliyuanService.selectOne(new EntityWrapper<ShequguanliyuanEntity>().eq("guanliyuanhao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setMima("123456");
        shequguanliyuanService.updateById(u);
        return R.ok("密码已重置为：123456");
    }



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShequguanliyuanEntity shequguanliyuan,
		HttpServletRequest request){
        EntityWrapper<ShequguanliyuanEntity> ew = new EntityWrapper<ShequguanliyuanEntity>();

		PageUtils page = shequguanliyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequguanliyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShequguanliyuanEntity shequguanliyuan, 
		HttpServletRequest request){
        EntityWrapper<ShequguanliyuanEntity> ew = new EntityWrapper<ShequguanliyuanEntity>();

		PageUtils page = shequguanliyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequguanliyuan), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShequguanliyuanEntity shequguanliyuan){
       	EntityWrapper<ShequguanliyuanEntity> ew = new EntityWrapper<ShequguanliyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shequguanliyuan, "shequguanliyuan")); 
        return R.ok().put("data", shequguanliyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShequguanliyuanEntity shequguanliyuan){
        EntityWrapper< ShequguanliyuanEntity> ew = new EntityWrapper< ShequguanliyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shequguanliyuan, "shequguanliyuan")); 
		ShequguanliyuanView shequguanliyuanView =  shequguanliyuanService.selectView(ew);
		return R.ok("查询社区管理员成功").put("data", shequguanliyuanView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShequguanliyuanEntity shequguanliyuan = shequguanliyuanService.selectById(id);
        return R.ok().put("data", shequguanliyuan);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShequguanliyuanEntity shequguanliyuan = shequguanliyuanService.selectById(id);
        return R.ok().put("data", shequguanliyuan);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShequguanliyuanEntity shequguanliyuan, HttpServletRequest request){
        if(shequguanliyuanService.selectCount(new EntityWrapper<ShequguanliyuanEntity>().eq("guanliyuanhao", shequguanliyuan.getGuanliyuanhao()))>0) {
            return R.error("管理员号已存在");
        }
    	shequguanliyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequguanliyuan);
    	ShequguanliyuanEntity u = shequguanliyuanService.selectOne(new EntityWrapper<ShequguanliyuanEntity>().eq("guanliyuanhao", shequguanliyuan.getGuanliyuanhao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		shequguanliyuan.setId(new Date().getTime());
        shequguanliyuanService.insert(shequguanliyuan);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShequguanliyuanEntity shequguanliyuan, HttpServletRequest request){
        if(shequguanliyuanService.selectCount(new EntityWrapper<ShequguanliyuanEntity>().eq("guanliyuanhao", shequguanliyuan.getGuanliyuanhao()))>0) {
            return R.error("管理员号已存在");
        }
    	shequguanliyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequguanliyuan);
    	ShequguanliyuanEntity u = shequguanliyuanService.selectOne(new EntityWrapper<ShequguanliyuanEntity>().eq("guanliyuanhao", shequguanliyuan.getGuanliyuanhao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		shequguanliyuan.setId(new Date().getTime());
        shequguanliyuanService.insert(shequguanliyuan);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShequguanliyuanEntity shequguanliyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shequguanliyuan);
        if(shequguanliyuanService.selectCount(new EntityWrapper<ShequguanliyuanEntity>().ne("id", shequguanliyuan.getId()).eq("guanliyuanhao", shequguanliyuan.getGuanliyuanhao()))>0) {
            return R.error("管理员号已存在");
        }
        shequguanliyuanService.updateById(shequguanliyuan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shequguanliyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
