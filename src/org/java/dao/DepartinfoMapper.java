package org.java.dao;

import org.java.entity.Departinfo;

public interface DepartinfoMapper {
    int deleteByPrimaryKey(Integer departid);

    int insert(Departinfo record);

    int insertSelective(Departinfo record);

    Departinfo selectByPrimaryKey(Integer departid);

    int updateByPrimaryKeySelective(Departinfo record);

    int updateByPrimaryKey(Departinfo record);
}