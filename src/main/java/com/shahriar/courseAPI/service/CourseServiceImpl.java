package com.shahriar.courseAPI.service;

import com.shahriar.courseAPI.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<Course>();
        list.add(new Course(145L, "Java course", "This course contain basic s of java"));
        list.add(new Course(385L, "Python course", "This course contain basic s of Python"));
    }

    @Override
    public Course getCourse(Long id) {
        for (Course course : list) {
            if (course.getId().equals(id)) {
                return course;
            }
        }
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return list;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        list.forEach(e -> {
            if (e.getId().equals(course.getId())) {
                e.setName(course.getName());
                e.setDescription(course.getDescription());
            }
        });
        return course;
    }

    @Override
    public void deleteCourse(Long id) {
        list=this.list.stream().filter(e-> !Objects.equals(e.getId(), id)).collect(Collectors.toList());
    }


}
