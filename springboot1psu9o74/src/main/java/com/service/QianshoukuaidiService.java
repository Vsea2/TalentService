package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QianshoukuaidiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QianshoukuaidiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QianshoukuaidiView;


/**
 * 签收快递
 *
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
public interface QianshoukuaidiService extends IService<QianshoukuaidiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QianshoukuaidiVO> selectListVO(Wrapper<QianshoukuaidiEntity> wrapper);
   	
   	QianshoukuaidiVO selectVO(@Param("ew") Wrapper<QianshoukuaidiEntity> wrapper);
   	
   	List<QianshoukuaidiView> selectListView(Wrapper<QianshoukuaidiEntity> wrapper);
   	
   	QianshoukuaidiView selectView(@Param("ew") Wrapper<QianshoukuaidiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QianshoukuaidiEntity> wrapper);

   	

}

