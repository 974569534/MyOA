package org.java.dao;

import org.java.entity.Manualsign;

public interface ManualsignMapper {
    int deleteByPrimaryKey(Integer signid);

    int insert(Manualsign record);

    int insertSelective(Manualsign record);

    Manualsign selectByPrimaryKey(Integer signid);

    int updateByPrimaryKeySelective(Manualsign record);

    int updateByPrimaryKey(Manualsign record);
}