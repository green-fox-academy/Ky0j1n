package com.greenfox.hellobean.model;




public class RedColor implements MyColor {
    String color = "red";

    @Override
    public String printColor() {
        return " It is " + color + " in color";
    }
}
