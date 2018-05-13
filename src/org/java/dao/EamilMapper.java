package org.java.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.java.entity.Eamil;

public interface EamilMapper {
    int deleteByPrimaryKey(Integer eamilid);

    int insert(Eamil record);

    int insertSelective(Eamil record);

    Eamil selectByPrimaryKey(Integer eamilid);

    int updateByPrimaryKeySelective(Eamil record);

    int updateByPrimaryKey(Eamil record);
    
    List<Map<String, Object>> selectAll(@Param("userid")String userId);
    
    Map<String, Object> selectByDetails(@Param("userid")String userId,@Param("eamilid")Integer eamilId);
    
}