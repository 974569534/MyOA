package org.java.dao;

import org.java.entity.Schedule;

public interface ScheduleMapper {
    int deleteByPrimaryKey(Integer scheduleid);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    Schedule selectByPrimaryKey(Integer scheduleid);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);
}