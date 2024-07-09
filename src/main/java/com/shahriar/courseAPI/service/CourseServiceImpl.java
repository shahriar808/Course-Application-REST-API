package com.shahriar.courseAPI.service;

import com.shahriar.courseAPI.dao.CourseDao;
import com.shahriar.courseAPI.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDao courseDao;

    public CourseServiceImpl() {}

    @Override
    public Optional<Course> getCourse(Long id) {
        return courseDao.findById(id);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course addCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseDao.deleteById(id);
    }


}
