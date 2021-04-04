package com.marcelocamillo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelocamillo.course.entities.User;
import com.marcelocamillo.course.repositories.UserRepository;

@Service // registra a classe como um componente do spring
public class UserService {
	@Autowired // injeção de dependência
	private UserRepository repository;
	
	// retorna todos os usuários do banco de dados
	public List<User> findAll() {
		return repository.findAll();
	}
	
	// retorna o usuário por id do banco de dados
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		
		return obj.get();
	}
}
