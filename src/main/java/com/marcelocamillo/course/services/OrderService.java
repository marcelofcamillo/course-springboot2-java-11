package com.marcelocamillo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelocamillo.course.entities.Order;
import com.marcelocamillo.course.repositories.OrderRepository;

@Service // registra a classe como um componente do spring
public class OrderService {
	@Autowired // injeção de dependência
	private OrderRepository repository;
	
	// retorna todos os pedidos do banco de dados
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	// retorna o pedido por id do banco de dados
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		
		return obj.get();
	}
}
