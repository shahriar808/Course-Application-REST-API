package com.shahriar.courseAPI.service;

import com.shahriar.courseAPI.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {
    public Course getCourse(Long id);
    public List<Course> getAllCourses();
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(Long id);
}