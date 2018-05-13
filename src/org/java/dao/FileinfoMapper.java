package org.java.dao;

import org.java.entity.Fileinfo;

public interface FileinfoMapper {
    int deleteByPrimaryKey(Integer fileid);

    int insert(Fileinfo record);

    int insertSelective(Fileinfo record);

    Fileinfo selectByPrimaryKey(Integer fileid);

    int updateByPrimaryKeySelective(Fileinfo record);

    int updateByPrimaryKey(Fileinfo record);
}