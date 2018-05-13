package org.java.dao;

import org.java.entity.Operatelog;

public interface OperatelogMapper {
    int deleteByPrimaryKey(Integer operateid);

    int insert(Operatelog record);

    int insertSelective(Operatelog record);

    Operatelog selectByPrimaryKey(Integer operateid);

    int updateByPrimaryKeySelective(Operatelog record);

    int updateByPrimaryKey(Operatelog record);
}