package com.dao;

import com.entity.WeixiuchuliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiuchuliVO;
import com.entity.view.WeixiuchuliView;


/**
 * 维修处理
 * 
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
public interface WeixiuchuliDao extends BaseMapper<WeixiuchuliEntity> {
	
	List<WeixiuchuliVO> selectListVO(@Param("ew") Wrapper<WeixiuchuliEntity> wrapper);
	
	WeixiuchuliVO selectVO(@Param("ew") Wrapper<WeixiuchuliEntity> wrapper);
	
	List<WeixiuchuliView> selectListView(@Param("ew") Wrapper<WeixiuchuliEntity> wrapper);

	List<WeixiuchuliView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiuchuliEntity> wrapper);

	
	WeixiuchuliView selectView(@Param("ew") Wrapper<WeixiuchuliEntity> wrapper);
	

}
