package com.rohit.controller;

import com.rohit.model.Post;
import com.rohit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(method = RequestMethod.GET,value = "/createPost")
    public String createPost(Model model){
        Post post=new Post();
        post.setPostId(111);
        model.addAttribute("post",post);
        System.out.println("inside createPost method");
        return "createPost";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/home")
    public String home(){
        System.out.println("inside home method");
        return "home";
    }

    @PostMapping("/save")
    public Post save(Post post){
        return postService.savePost(post);
    }

    @PostMapping("/delete")
    public String delete(int id){
        return postService.deletePost(id);
    }

    @GetMapping("/get")
    public Optional<Post> get(int id){
        return postService.getPost(id);
    }

    @GetMapping("/getAll")
    public List<Post> getAll(){
        return postService.getAllPosts();
    }

//    @PostMapping("/savePost")
//    public String submit(@ModelAttribute("post") Post post, RedirectAttributes redirectAttributes){
//        // save post to database
//        redirectAttributes.addFlashAttribute("savedPost",post);
//        return "redirect:/postDetail";
//    }

    @PostMapping("/postDetail")
    public String showDetail(){
        return "redirect:/postDetail";
    }

    @PostMapping("/savePost")
    public String savePost(@ModelAttribute("post") Post post){
        postService.savePost(post);
        System.out.println("post saved");
        return "savedPostView";
    }
}
