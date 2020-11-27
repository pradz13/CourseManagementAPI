package com.pradz.course.management.service;


import com.pradz.course.management.entity.Course;

import java.util.List;

public interface CourseManagementService {

    List<Course> getAllCourses();

    Course getCourse(long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long courseId);
}
