package org.java.dao;

import org.java.entity.Rolepermission;

public interface RolepermissionMapper {
    int deleteByPrimaryKey(Integer rolepermissionid);

    int insert(Rolepermission record);

    int insertSelective(Rolepermission record);

    Rolepermission selectByPrimaryKey(Integer rolepermissionid);

    int updateByPrimaryKeySelective(Rolepermission record);

    int updateByPrimaryKey(Rolepermission record);
}