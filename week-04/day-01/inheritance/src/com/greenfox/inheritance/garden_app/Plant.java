package com.greenfox.inheritance.garden_app;

public abstract class Plant {
    String color;
    int waterLvl = 0;
    String type;

    public Plant(String color) {
        this.color = color;

    }

    public String genericStatus() {
        return "This " + color + " " + type;
    }

    public String needsWater() {
        return " needs water!";
    }

    public String noWater() {
        return " doesn't need water!";
    }

    public abstract void status();


}