package com.devlps.dslearnbds.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlps.dslearnbds.dto.UserDTO;
import com.devlps.dslearnbds.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
	
	@Autowired
	private UserService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id){
		UserDTO dto = service.findById(id);
		
		return ResponseEntity.ok().body(dto);
		
	}

}
