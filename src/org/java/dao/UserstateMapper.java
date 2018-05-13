package org.java.dao;

import org.java.entity.Userstate;

public interface UserstateMapper {
    int deleteByPrimaryKey(Integer userstateid);

    int insert(Userstate record);

    int insertSelective(Userstate record);

    Userstate selectByPrimaryKey(Integer userstateid);

    int updateByPrimaryKeySelective(Userstate record);

    int updateByPrimaryKey(Userstate record);
}