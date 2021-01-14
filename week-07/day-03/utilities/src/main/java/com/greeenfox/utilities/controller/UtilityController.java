package com.greeenfox.utilities.controller;

import com.greeenfox.utilities.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {
    UtilityService utilityService;


    @Autowired
public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
}

    @GetMapping("/useful")
    public String index() {
        return "index";
    }

    @GetMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("utility", utilityService.randomColor());
        return "colored";
    }
}
