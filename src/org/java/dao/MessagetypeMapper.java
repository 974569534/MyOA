package org.java.dao;

import org.java.entity.Messagetype;

public interface MessagetypeMapper {
    int deleteByPrimaryKey(Integer messagetypeid);

    int insert(Messagetype record);

    int insertSelective(Messagetype record);

    Messagetype selectByPrimaryKey(Integer messagetypeid);

    int updateByPrimaryKeySelective(Messagetype record);

    int updateByPrimaryKey(Messagetype record);
}