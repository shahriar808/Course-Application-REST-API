package com.shahriar.courseAPI.dao;

import com.shahriar.courseAPI.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {
}
