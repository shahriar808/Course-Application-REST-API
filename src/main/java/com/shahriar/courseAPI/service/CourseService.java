package com.shahriar.courseAPI.service;

import com.shahriar.courseAPI.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public Optional<Course> getCourse(Long id);
    public List<Course> getAllCourses();
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(Long id);
}
