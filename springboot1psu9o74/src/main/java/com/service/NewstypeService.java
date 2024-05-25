package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NewstypeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NewstypeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NewstypeView;


/**
 * 社区资讯分类
 *
 * @author 
 * @email 
 * @date 2024-04-13 09:13:19
 */
public interface NewstypeService extends IService<NewstypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NewstypeVO> selectListVO(Wrapper<NewstypeEntity> wrapper);
   	
   	NewstypeVO selectVO(@Param("ew") Wrapper<NewstypeEntity> wrapper);
   	
   	List<NewstypeView> selectListView(Wrapper<NewstypeEntity> wrapper);
   	
   	NewstypeView selectView(@Param("ew") Wrapper<NewstypeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NewstypeEntity> wrapper);

   	

}

