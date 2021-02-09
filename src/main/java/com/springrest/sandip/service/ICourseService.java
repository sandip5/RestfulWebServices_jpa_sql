package com.springrest.sandip.service;

import com.springrest.sandip.entity.Course;

import java.util.List;

public interface ICourseService {
    public List<Course> getListOfCourse();
    public Course getCourse(Long id);

    Course addNewCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long courseId);
}
