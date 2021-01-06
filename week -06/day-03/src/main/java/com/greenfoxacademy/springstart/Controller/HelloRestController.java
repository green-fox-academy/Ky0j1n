package com.greenfoxacademy.springstart.Controller;

import com.greenfoxacademy.springstart.Main;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping(value="/a")
    public Greeting greeting() {
        return new Greeting();
    }

}
