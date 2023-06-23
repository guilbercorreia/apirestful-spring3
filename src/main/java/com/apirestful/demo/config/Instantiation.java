package com.apirestful.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.apirestful.demo.domain.User;
import com.apirestful.demo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
		
	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		
		User u1 = new User(null, "Maria Ferreia", "mariaf@gmail.com");
		User u2 = new User(null, "Alex Correia", "alexc@gmail.com");
		User u3 = new User(null, "Wagner Silva", "wagners@gmail.com");
		
		repository.saveAll(Arrays.asList(u1,u2,u3));
		
	}

}
