package database.dao;

import database.pojo.DateDemo;

public interface DateDemoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DateDemo record);

    int insertSelective(DateDemo record);

    DateDemo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DateDemo record);

    int updateByPrimaryKey(DateDemo record);
}