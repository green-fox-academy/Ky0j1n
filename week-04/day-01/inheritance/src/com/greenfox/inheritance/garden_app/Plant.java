package com.greenfox.inheritance.garden_app;

public abstract class Plant {
    String color;
    int waterLvl = 0;


    public Plant(String color) {
        this.color = color;

    }

    public String genericStatus() {
        return "This " + color + " " + getType();
    }

    public String needsWater() {
        return " needs water!";
    }

    public String noWater() {
        return " doesn't need water!";
    }

    public abstract void status();

    public abstract String getType();

    public abstract double getAbsorbtionLvl();

    public boolean isThirsty() {

        return this.waterLvl <= underThatLvlINeedWater();

    }

    public abstract int underThatLvlINeedWater();

}