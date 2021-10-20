package com.devlps.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlps.dslearnbds.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
