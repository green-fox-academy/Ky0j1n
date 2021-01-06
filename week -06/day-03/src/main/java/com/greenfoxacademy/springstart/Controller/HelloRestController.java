package com.greenfoxacademy.springstart.Controller;

import com.greenfoxacademy.springstart.Main;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping(value="/a")
    public Greeting greeting(@RequestParam String name) {
            Long greetCounter = atomicLong.getGreetCount();
        Greeting greeting =  new Greeting(greetCounter, name);
        return  greeting;
    }


}