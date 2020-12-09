package com.greenfox.inheritance.garden_app;

public class Tree extends Plant {


    public Tree(String color) {
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
        return "tree";
    }

    @Override
    public double getAbsorbtionLvl() {
        return 0.40;
    }

    @Override
    public int underThatLvlINeedWater() {
        return 10;
    }


}
