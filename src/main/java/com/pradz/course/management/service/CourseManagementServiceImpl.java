package com.pradz.course.management.service;

import com.pradz.course.management.dao.CourseManagementDao;
import com.pradz.course.management.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseManagementServiceImpl implements CourseManagementService {

    @Autowired
    private CourseManagementDao courseManagementDao;

    /*List<Course> courseList;

    public CourseManagementServiceImpl() {
        courseList = new ArrayList<>();
        courseList.add(new Course(145, "Java Course", "Java"));
        courseList.add(new Course(245, "Spring Boot Course", "Spring Boot"));
    }*/

    @Override
    public List<Course> getAllCourses() {
        //return this.courseList;
        return this.courseManagementDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        /*Optional<Course> matchedCourse = courseList.stream().filter(course -> course.getId() == courseId).findFirst();
        return matchedCourse.orElse(null);*/
        return this.courseManagementDao.findById(courseId).get();
    }

    @Override
    public Course addCourse(Course course) {
        /*courseList.add(course);
        return course;*/
        this.courseManagementDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        /*courseList.forEach(c -> {
            if (c.getId() == course.getId()) {
                c.setTitle(course.getTitle());
                c.setDescription(course.getDescription());
            }
        });
        return course;*/
        this.courseManagementDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
        //courseList = courseList.stream().filter(c -> c.getId() != courseId).collect(Collectors.toList());
        Course courseToBeDeleted = this.courseManagementDao.getOne(courseId);
        this.courseManagementDao.delete(courseToBeDeleted);
    }
}
