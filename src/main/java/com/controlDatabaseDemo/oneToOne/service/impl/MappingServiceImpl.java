package com.controlDatabaseDemo.oneToOne.service.impl;

import com.controlDatabaseDemo.oneToOne.service.MappingService;
import database.dao.DateDemoMapper;
import database.dao.StudentMapper;
import database.dao.TutorMapper;
import database.pojo.DateDemo;
import database.pojo.Student;
import database.pojo.Tutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yilu on 18/8/17.
 */
@Service("OneToOneService")
public class MappingServiceImpl implements MappingService {
    @Resource
    StudentMapper studentMapper;
    @Resource
    TutorMapper tutorMapper;
    @Resource
    DateDemoMapper dateDemoMapper;
    public Student selectStudentWithCourseByStudentId(int id) {
        return studentMapper.selectStudentWithCourseByStudentId(id);
    }

    public Tutor selectTutorWithCoursesWithTutorName(String tutorName) {
        return tutorMapper.selectTutorWithCoursesWithTutorName(tutorName);
    }

    public DateDemo selectDateByPrimaryKey(Integer id) {
        return dateDemoMapper.selectByPrimaryKey(1);
    }
}
