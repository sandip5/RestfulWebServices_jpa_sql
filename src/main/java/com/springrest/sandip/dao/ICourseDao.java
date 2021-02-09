package com.springrest.sandip.dao;

import com.springrest.sandip.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseDao extends JpaRepository<Course, Long> {
}
