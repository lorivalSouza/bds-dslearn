package com.devlps.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlps.dslearnbds.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
