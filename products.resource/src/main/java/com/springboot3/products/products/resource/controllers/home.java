package com.springboot3.products.products.resource.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class home {
    
    @GetMapping("/test")
    public String index() {
        return "products backend.";
    }
}
