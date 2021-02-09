package com.springrest.sandip.service;

import com.springrest.sandip.dao.ICourseDao;
import com.springrest.sandip.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImplCourseService implements ICourseService{
    @Autowired
    private ICourseDao courseDao;
    List<Course> courseList;

    public ImplCourseService() {
//        courseList = new ArrayList<>();
//        Course firstCourse = new Course(1L, "Java Core","Sandip Singh");
//        Course secondCourse = new Course(2L, "JSP-Servlet", "Tony Singh");
//
//        courseList.add(firstCourse);
//        courseList.add(secondCourse);
    }

    @Override
    public Course getCourse(Long id) {
//        for (Course course : courseList) {
//            if (id.equals(course.getId())) {
//                return course;
//            }
//        }
//        return null;

        return courseDao.getOne(id);
    }

    @Override
    public Course addNewCourse(Course course) {
//        courseList.add(course);
//        return course;
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        Course sampleCourse = null;
//        for(Course courseItr : courseList) {
//            if(courseItr.getId().equals(course.getId())) {
//                courseItr.setCourseName(course.getCourseName());
//                courseItr.setReleaseDate(course.getReleaseDate());
//                courseItr.setAuthor(course.getAuthor());
//                sampleCourse = courseItr;
//            }
//        }
//        return sampleCourse;
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
//        courseList.removeIf(course -> courseId == course.getId());
        Course entity = courseDao.getOne(courseId);
        courseDao.delete(entity);
    }

    @Override
    public List<Course> getListOfCourse() {
//        return courseList;
        return courseDao.findAll();
    }
}
