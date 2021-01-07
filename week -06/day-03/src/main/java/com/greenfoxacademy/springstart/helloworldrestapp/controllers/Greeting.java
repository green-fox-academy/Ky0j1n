package com.greenfoxacademy.springstart.helloworldrestapp.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    Long greetCount;
    String content;



    public Greeting(Long greetCount, String content) {
        this.greetCount = greetCount;
        this.content = content;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getGreetCount() {
        return greetCount;
    }

    public void setGreetCount(Long greetCount) {
        this.greetCount = greetCount;
    }
}
