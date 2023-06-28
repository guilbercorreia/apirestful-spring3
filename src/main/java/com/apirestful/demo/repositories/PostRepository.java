package com.apirestful.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.apirestful.demo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
