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


import com.dao.ShequguanliyuanDao;
import com.entity.ShequguanliyuanEntity;
import com.service.ShequguanliyuanService;
import com.entity.vo.ShequguanliyuanVO;
import com.entity.view.ShequguanliyuanView;

@Service("shequguanliyuanService")
public class ShequguanliyuanServiceImpl extends ServiceImpl<ShequguanliyuanDao, ShequguanliyuanEntity> implements ShequguanliyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequguanliyuanEntity> page = this.selectPage(
                new Query<ShequguanliyuanEntity>(params).getPage(),
                new EntityWrapper<ShequguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequguanliyuanEntity> wrapper) {
		  Page<ShequguanliyuanView> page =new Query<ShequguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShequguanliyuanVO> selectListVO(Wrapper<ShequguanliyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequguanliyuanVO selectVO(Wrapper<ShequguanliyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequguanliyuanView> selectListView(Wrapper<ShequguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequguanliyuanView selectView(Wrapper<ShequguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
