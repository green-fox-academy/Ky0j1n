package com.greenfox.restapp.service;

import com.greenfox.restapp.model.Greeter;
import org.springframework.stereotype.Service;

@Service
public class GreeterService {
    public Greeter greet(String name, String title) throws Exception {
        if (name == null || title == null) {
            throw new Exception();
        } else {
            return new Greeter(name, title);
        }
    }
}
