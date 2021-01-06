package com.greenfoxacademy.springstart.Controller;

import com.greenfoxacademy.springstart.Main;

public class Greeting {
    long id = 1L;
    String content;

    public Greeting() {
        content = getContent();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        Main main = new Main();
        return main.hello();
    }
}
