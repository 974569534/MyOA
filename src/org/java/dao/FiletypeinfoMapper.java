package org.java.dao;

import org.java.entity.Filetypeinfo;

public interface FiletypeinfoMapper {
    int deleteByPrimaryKey(Integer filetypeid);

    int insert(Filetypeinfo record);

    int insertSelective(Filetypeinfo record);

    Filetypeinfo selectByPrimaryKey(Integer filetypeid);

    int updateByPrimaryKeySelective(Filetypeinfo record);

    int updateByPrimaryKey(Filetypeinfo record);
}