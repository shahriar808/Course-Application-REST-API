package com.shahriar.courseAPI.controller;

import com.shahriar.courseAPI.entity.Course;
import com.shahriar.courseAPI.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> courses() {
        return this.courseService.getAllCourses();
    }
    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable Long id) {
        return this.courseService.getCourse(id);
    }

    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/course/{id}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable Long id) {
        try {
            this.courseService.deleteCourse(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
