package org.java.dao;

import org.java.entity.Precontract;

public interface PrecontractMapper {
    int deleteByPrimaryKey(Integer meetingid);

    int insert(Precontract record);

    int insertSelective(Precontract record);

    Precontract selectByPrimaryKey(Integer meetingid);

    int updateByPrimaryKeySelective(Precontract record);

    int updateByPrimaryKey(Precontract record);
}