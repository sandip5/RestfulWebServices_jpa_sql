package com.springrest.sandip.controller;

import com.springrest.sandip.entity.Course;
import com.springrest.sandip.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private ICourseService courseService;

    @GetMapping("/test")
    public String test() {
        return "Testing Api With Help Of Boot";
    }

    /**
     * Get List Of Courses
     */
    @GetMapping("/courses")
    public List<Course> getListOfCourse() {
        return courseService.getListOfCourse();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping(path = "/courses", consumes = "application/json")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addNewCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
        try {
            courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
