package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QianshoukuaidiDao;
import com.entity.QianshoukuaidiEntity;
import com.service.QianshoukuaidiService;
import com.entity.vo.QianshoukuaidiVO;
import com.entity.view.QianshoukuaidiView;

@Service("qianshoukuaidiService")
public class QianshoukuaidiServiceImpl extends ServiceImpl<QianshoukuaidiDao, QianshoukuaidiEntity> implements QianshoukuaidiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QianshoukuaidiEntity> page = this.selectPage(
                new Query<QianshoukuaidiEntity>(params).getPage(),
                new EntityWrapper<QianshoukuaidiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QianshoukuaidiEntity> wrapper) {
		  Page<QianshoukuaidiView> page =new Query<QianshoukuaidiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<QianshoukuaidiVO> selectListVO(Wrapper<QianshoukuaidiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QianshoukuaidiVO selectVO(Wrapper<QianshoukuaidiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QianshoukuaidiView> selectListView(Wrapper<QianshoukuaidiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QianshoukuaidiView selectView(Wrapper<QianshoukuaidiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
