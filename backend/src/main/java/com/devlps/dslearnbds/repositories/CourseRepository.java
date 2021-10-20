package com.devlps.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlps.dslearnbds.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
