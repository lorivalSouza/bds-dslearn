package com.devlps.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlps.dslearnbds.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
