package org.java.dao;

import org.java.entity.Userinfo;

public interface UserinfoMapper {
    int deleteByPrimaryKey(String userid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}