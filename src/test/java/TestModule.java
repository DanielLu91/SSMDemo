import com.controlDatabaseDemo.oneToOne.service.MappingService;
import database.pojo.Course;
import database.pojo.Student;
import database.pojo.Tutor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by yilu on 15/8/17.
 */
//表示继承了SpringJUnit4ClassRunner类
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestModule {
    @Resource
    MappingService mappingService;
    @Test
    public void testOneToOne(){
            Student student= mappingService.selectStudentWithCourseByStudentId(1);
            String name=student.getCourse().getCourseName();
            System.out.println(name);
    }

    @Test
    public void testOneToMany(){
        Tutor tutor=mappingService.selectTutorWithCoursesWithTutorName("Peter");
        List<Course> courseList=tutor.getCourseList();
        for(Course course:courseList)
            System.out.println(course.getCourseName());
    }
    @Test
    public void display(){
        long time= (long) System.currentTimeMillis()/1000;
        System.out.print(time);
    }
    @Test
    public void dateDemo(){
        Date dateDemo=mappingService.selectDateByPrimaryKey(1).getDate();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
        String num=simpleDateFormat.format(dateDemo);
        System.out.println(dateDemo.getTime()-System.currentTimeMillis());
        System.out.print(num);
    }
}
