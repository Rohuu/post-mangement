package com.rohit.repository;

import com.rohit.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Integer>{
}
