package com.greenfox.rei.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/user")
    public String getUser() {
        return "user";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "admin";
    }
}
