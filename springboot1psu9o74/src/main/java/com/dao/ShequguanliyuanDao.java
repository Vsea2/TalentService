package com.dao;

import com.entity.ShequguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequguanliyuanVO;
import com.entity.view.ShequguanliyuanView;


/**
 * 社区管理员
 * 
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
public interface ShequguanliyuanDao extends BaseMapper<ShequguanliyuanEntity> {
	
	List<ShequguanliyuanVO> selectListVO(@Param("ew") Wrapper<ShequguanliyuanEntity> wrapper);
	
	ShequguanliyuanVO selectVO(@Param("ew") Wrapper<ShequguanliyuanEntity> wrapper);
	
	List<ShequguanliyuanView> selectListView(@Param("ew") Wrapper<ShequguanliyuanEntity> wrapper);

	List<ShequguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShequguanliyuanEntity> wrapper);

	
	ShequguanliyuanView selectView(@Param("ew") Wrapper<ShequguanliyuanEntity> wrapper);
	

}
