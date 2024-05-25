package com.dao;

import com.entity.QianshoukuaidiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QianshoukuaidiVO;
import com.entity.view.QianshoukuaidiView;


/**
 * 签收快递
 * 
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
public interface QianshoukuaidiDao extends BaseMapper<QianshoukuaidiEntity> {
	
	List<QianshoukuaidiVO> selectListVO(@Param("ew") Wrapper<QianshoukuaidiEntity> wrapper);
	
	QianshoukuaidiVO selectVO(@Param("ew") Wrapper<QianshoukuaidiEntity> wrapper);
	
	List<QianshoukuaidiView> selectListView(@Param("ew") Wrapper<QianshoukuaidiEntity> wrapper);

	List<QianshoukuaidiView> selectListView(Pagination page,@Param("ew") Wrapper<QianshoukuaidiEntity> wrapper);

	
	QianshoukuaidiView selectView(@Param("ew") Wrapper<QianshoukuaidiEntity> wrapper);
	

}
