package com.example.SpringBootWebApplication.repository;

import com.example.SpringBootWebApplication.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
