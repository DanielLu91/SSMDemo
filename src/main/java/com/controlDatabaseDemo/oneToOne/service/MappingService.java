package com.controlDatabaseDemo.oneToOne.service;

import database.pojo.DateDemo;
import database.pojo.Student;
import database.pojo.Tutor;

/**
 * Created by yilu on 18/8/17.
 */
public interface MappingService {
//    One to one Demo
    Student selectStudentWithCourseByStudentId(int id);
//    One to many Demo
    Tutor selectTutorWithCoursesWithTutorName(String tutorName);

    DateDemo selectDateByPrimaryKey(Integer id);
}
