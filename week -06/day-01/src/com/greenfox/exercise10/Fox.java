package com.greenfox.exercise10;
//Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
public class Fox {
    String name;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    String color;
    int age;

    public Fox(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }



}
