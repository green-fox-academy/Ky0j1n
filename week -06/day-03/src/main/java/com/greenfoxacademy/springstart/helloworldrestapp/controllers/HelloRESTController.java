package com.greenfoxacademy.springstart.helloworldrestapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong counter = new AtomicLong();
    @RequestMapping(value="greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam String name) {

        Greeting greeting = new Greeting(counter.incrementAndGet(), "Minden jó "+ name + " !!!");
        return greeting;
    }

}
