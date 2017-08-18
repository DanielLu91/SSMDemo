package database.dao;

import database.pojo.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer stId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    Student selectStudentWithCourseByStudentId(Integer studentId);
}