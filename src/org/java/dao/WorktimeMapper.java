package org.java.dao;

import org.java.entity.Worktime;

public interface WorktimeMapper {
    int deleteByPrimaryKey(Integer worktimeid);

    int insert(Worktime record);

    int insertSelective(Worktime record);

    Worktime selectByPrimaryKey(Integer worktimeid);

    int updateByPrimaryKeySelective(Worktime record);

    int updateByPrimaryKey(Worktime record);
}