package org.java.dao;

import org.java.entity.Branchinfo;

public interface BranchinfoMapper {
    int deleteByPrimaryKey(Integer branchid);

    int insert(Branchinfo record);

    int insertSelective(Branchinfo record);

    Branchinfo selectByPrimaryKey(Integer branchid);

    int updateByPrimaryKeySelective(Branchinfo record);

    int updateByPrimaryKey(Branchinfo record);
}