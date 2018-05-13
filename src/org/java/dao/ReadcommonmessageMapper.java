package org.java.dao;

import org.java.entity.Readcommonmessage;

public interface ReadcommonmessageMapper {
    int deleteByPrimaryKey(Integer readid);

    int insert(Readcommonmessage record);

    int insertSelective(Readcommonmessage record);

    Readcommonmessage selectByPrimaryKey(Integer readid);

    int updateByPrimaryKeySelective(Readcommonmessage record);

    int updateByPrimaryKey(Readcommonmessage record);
}