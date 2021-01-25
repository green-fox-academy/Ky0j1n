package com.greenfox.restapp.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class Controller {
    @GetMapping("/")
    public String getIndexPage(){
        return "index";
    }
}
