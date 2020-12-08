package com.greenfox.inheritance.garden_app;

public class Flower extends Plant {

    public Flower(String color) {
        super(color);
        this.type = "flower";
    }

    @Override
    public void status() {
        if (waterLvl < 5) {
            System.out.println(genericStatus() + needsWater());
        } else {
            System.out.println(genericStatus() + noWater());
        }
    }


}
