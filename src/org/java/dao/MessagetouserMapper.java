package org.java.dao;

import org.java.entity.Messagetouser;

public interface MessagetouserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Messagetouser record);

    int insertSelective(Messagetouser record);

    Messagetouser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Messagetouser record);

    int updateByPrimaryKey(Messagetouser record);
}