package com.greenfox.hellobean.model;

import org.springframework.stereotype.Service;

@Service
public class YellowColor implements MyColor {
    String color = "yellow";

    @Override
    public String printColor() {
       return  "This " + color + " in color";
    }
}
