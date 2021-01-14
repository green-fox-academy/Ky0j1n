package com.greenfox.greenfoxapp.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IntroductionController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
