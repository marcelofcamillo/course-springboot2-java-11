package com.marcelocamillo.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelocamillo.course.entities.Order;
import com.marcelocamillo.course.services.OrderService;

//controlador REST que responde no caminho /orders

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	@Autowired // dependencia para o service
	private OrderService service;
	
	@GetMapping // endpoint para acessar todos os usuários
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") // endpoint para acessar os usuários por id
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
