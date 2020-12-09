package com.greenfox.inheritance.garden_app;

public class Flower extends Plant {

    public Flower(String color) {
        super(color);
    }

    @Override
    public void status() {
        if (waterLvl < underThatLvlINeedWater()) {
            System.out.println(genericStatus() + needsWater());
        } else {
            System.out.println(genericStatus() + noWater());
        }
    }

    @Override
    public String getType() {
        return "flower";
    }

    @Override
    public double getAbsorbtionLvl() {
        return 0.75;
    }

    @Override
    public int underThatLvlINeedWater() {
        return 5;
    }


}
