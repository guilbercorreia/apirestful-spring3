package com.apirestful.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.apirestful.demo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
