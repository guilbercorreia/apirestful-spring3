package com.apirestful.demo.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirestful.demo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User u1 = new User("1", "maria", "maria@gmail.com");
		User u2 = new User("2", "joão", "joao@gmail.com");
		List<User> list = Arrays.asList(u1,u2);
		return ResponseEntity.ok(list);
			
	}
}
