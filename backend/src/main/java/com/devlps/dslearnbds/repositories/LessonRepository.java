package com.devlps.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlps.dslearnbds.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
