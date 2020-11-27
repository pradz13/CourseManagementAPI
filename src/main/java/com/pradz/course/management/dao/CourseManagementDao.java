package com.pradz.course.management.dao;

import com.pradz.course.management.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseManagementDao extends JpaRepository<Course, Long> {
}
