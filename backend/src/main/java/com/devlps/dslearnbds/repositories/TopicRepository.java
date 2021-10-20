package com.devlps.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlps.dslearnbds.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
