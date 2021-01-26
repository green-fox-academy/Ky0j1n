package com.greenfox.restapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @GetMapping("/")
    public String getIndexPage(){
        return "index";
    }
}
