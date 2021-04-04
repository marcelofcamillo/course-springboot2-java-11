package com.marcelocamillo.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelocamillo.course.entities.User;

//controlador REST que responde no caminho /users

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	// endpoint para acessar os usuários
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		
		return ResponseEntity.ok().body(u);
	}
}
