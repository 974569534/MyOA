package org.java.dao;

import org.java.entity.Emailtype;

public interface EmailtypeMapper {
    int deleteByPrimaryKey(Integer emailtypeid);

    int insert(Emailtype record);

    int insertSelective(Emailtype record);

    Emailtype selectByPrimaryKey(Integer emailtypeid);

    int updateByPrimaryKeySelective(Emailtype record);

    int updateByPrimaryKey(Emailtype record);
}