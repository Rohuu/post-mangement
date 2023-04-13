package com.rohit.service;

import com.rohit.model.Post;
import com.rohit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post){
        return postRepository.save(post);
    }

    public void deletePost(Post post){
        postRepository.delete(post);
    }

    public Optional<Post> getPost(int id){
        return postRepository.findById(id);
    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }
}