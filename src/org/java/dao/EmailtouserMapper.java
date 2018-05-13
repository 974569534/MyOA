package org.java.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.java.entity.Emailtouser;

public interface EmailtouserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Emailtouser record);

    int insertSelective(Emailtouser record);

    Emailtouser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Emailtouser record);

    int updateByPrimaryKey(Emailtouser record);
    
    int updateByEamilId(Emailtouser record);
    
    int updateDelEamilId(Emailtouser record);
    
}