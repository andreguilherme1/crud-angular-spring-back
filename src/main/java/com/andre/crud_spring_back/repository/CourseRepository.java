package com.andre.crud_spring_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.crud_spring_back.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
