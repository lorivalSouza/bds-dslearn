package com.devlps.dslearnbds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devlps.dslearnbds.dto.NotificationDTO;
import com.devlps.dslearnbds.entities.Notification;
import com.devlps.dslearnbds.entities.User;
import com.devlps.dslearnbds.repositories.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository repository;
	
	@Autowired
	private AuthService authService;

	@Transactional(readOnly = true)
	public Page<NotificationDTO> notificationForCurrent(Pageable pageable) {		
		User user = authService.authenticated();
		
		Page<Notification> page = repository.findByUser(user, pageable);
		
		return page.map(x -> new NotificationDTO(x));
		

	}

}
