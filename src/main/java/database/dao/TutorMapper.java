package database.dao;

import database.pojo.Tutor;

public interface TutorMapper {
    int deleteByPrimaryKey(Integer tutorId);

    int insert(Tutor record);

    int insertSelective(Tutor record);

    Tutor selectByPrimaryKey(Integer tutorId);

    int updateByPrimaryKeySelective(Tutor record);

    int updateByPrimaryKey(Tutor record);

    Tutor selectTutorWithCoursesWithTutorName(String tutorName);
}