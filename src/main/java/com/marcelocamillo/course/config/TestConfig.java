package com.marcelocamillo.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marcelocamillo.course.entities.User;
import com.marcelocamillo.course.repositories.UserRepository;

// classe de configurações especifica para o perfil de teste

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired // associa uma instancia do userRepository no TestConfig
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		// salva os users no banco de dados
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
