package com.springboot3.users.users.resource.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class home {


    @GetMapping("/test")
    public String index() {
        return "Users Backend";
    }
    
}
