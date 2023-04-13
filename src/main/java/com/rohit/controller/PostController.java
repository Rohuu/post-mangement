package com.rohit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController {

    @RequestMapping(method = RequestMethod.GET,value = "/createPost")
    public String createPost(){
        System.out.println("inside createPost method");
        return "createPost";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/home")
    public String home(){
        System.out.println("inside home method");
        return "home";
    }
}
