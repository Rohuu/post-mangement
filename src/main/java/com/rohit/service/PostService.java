package com.rohit.service;

import com.rohit.model.Post;
import com.rohit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post) {
        try {
            return postRepository.save(post);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String deletePost(int id){
        postRepository.deleteById(id);
        return "Post deleted"+id;
    }

    public Optional<Post> getPost(int id){
        return postRepository.findById(id);
    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }
}