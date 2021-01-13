package com.greenfox.hellobean.model;




public class BlueColor implements MyColor {
    String color = "blue";
    @Override
    public String printColor() {
        return "It is " + color + " in color";
    }
}
