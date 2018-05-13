package org.java.dao;

import org.java.entity.Mynote;

public interface MynoteMapper {
    int deleteByPrimaryKey(Integer noteid);

    int insert(Mynote record);

    int insertSelective(Mynote record);

    Mynote selectByPrimaryKey(Integer noteid);

    int updateByPrimaryKeySelective(Mynote record);

    int updateByPrimaryKey(Mynote record);
}