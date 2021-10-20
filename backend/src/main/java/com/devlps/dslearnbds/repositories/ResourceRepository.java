package com.devlps.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlps.dslearnbds.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
