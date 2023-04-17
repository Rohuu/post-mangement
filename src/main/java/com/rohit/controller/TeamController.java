package com.rohit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teams")
public class TeamController {

    @GetMapping("/all")
    public String index(){
        return "index";
    }
}

@Controller
@RequestMapping("/teams")
class TeamHistoryController {

    @GetMapping("/history")
    public String listHistory() {
        return "listHistory";
    }
}

// Note: two controllers can have same path in class level but not in method level as shown above //
