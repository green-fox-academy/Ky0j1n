package com.greenfoxacademy.springstart.helloworldrestapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value="greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam String name) {
        Greeting greeting = new Greeting(1, "Minden jó, " + name + " !!!");
        return greeting;
    }

}
