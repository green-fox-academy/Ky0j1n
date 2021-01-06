package com.greenfoxacademy.springstart.Controller;

import com.greenfoxacademy.springstart.Main;

public class Greeting {
    long id = 1L;
    String content;

    public Greeting(String name) {
       this.content = "Hello " + name;
    }


    public long getId() {
        return id;
    }


    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
