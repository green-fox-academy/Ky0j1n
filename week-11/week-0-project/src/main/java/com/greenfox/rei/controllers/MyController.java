package com.greenfox.rei.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/user")
    public String getUser() {
        return ("<h1> USER </h1>");
    }
}
