package com.greenfoxacademy.springstart.Controller;

public class AtomicLong {
    Long greetCount = 0L;


    public Long getGreetCount() {
        greetCount++;
        return greetCount;
    }
}
