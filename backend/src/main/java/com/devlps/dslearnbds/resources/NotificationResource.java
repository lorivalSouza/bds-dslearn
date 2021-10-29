package com.devlps.dslearnbds.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devlps.dslearnbds.dto.NotificationDTO;
import com.devlps.dslearnbds.services.NotificationService;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationResource {
	
	@Autowired
	NotificationService service;
	
	@GetMapping()
	public ResponseEntity<Page<NotificationDTO>> notificationForCurrent(
			@RequestParam(name = "unreadOnly", defaultValue = "false") Boolean unreadOnly,
			Pageable pageable){
		
		Page<NotificationDTO> page = service.notificationForCurrent(unreadOnly, pageable);
		
		return ResponseEntity.ok().body(page);
		
	}

}
