package com.greenfoxacademy.springstart.Controller;

import com.greenfoxacademy.springstartB.Main;

public class Greeting {
    Long greetCount;
    String content;


    public Greeting(Long greetCount, String name) {
        this.greetCount = greetCount;
        this.content = "Hello " + name + "!";

    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }
}
