package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequguanliyuanView;


/**
 * 社区管理员
 *
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
public interface ShequguanliyuanService extends IService<ShequguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequguanliyuanVO> selectListVO(Wrapper<ShequguanliyuanEntity> wrapper);
   	
   	ShequguanliyuanVO selectVO(@Param("ew") Wrapper<ShequguanliyuanEntity> wrapper);
   	
   	List<ShequguanliyuanView> selectListView(Wrapper<ShequguanliyuanEntity> wrapper);
   	
   	ShequguanliyuanView selectView(@Param("ew") Wrapper<ShequguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequguanliyuanEntity> wrapper);

   	

}

