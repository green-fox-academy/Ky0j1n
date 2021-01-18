package com.greenfox.demo.controller;

import com.greenfox.demo.service.FoxService;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam (required = true) String name) {
        model.addAttribute("name", name);
        model.addAttribute("foxData", foxService.getFox(name));
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String getLoggedIn(Model model, String name) {
        foxService.addNewFoxIfNotExist(name);
        model.addAttribute("name",name);
        return "redirect:/?name=" + name;
    }



}
