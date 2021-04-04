package com.marcelocamillo.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelocamillo.course.entities.User;
import com.marcelocamillo.course.services.UserService;

//controlador REST que responde no caminho /users

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	// dependencia para o service
	@Autowired
	private UserService service;
	
	// endpoint para acessar todos os usuários
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
	
	// endpoint para acessar os usuários por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
