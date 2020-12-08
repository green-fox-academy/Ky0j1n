package com.greenfox.inheritance.garden_app;

public class Tree extends Plant {


    public Tree(String color) {
        super(color);
        this.type = "tree";
    }

    @Override
    public void status() {
        if (waterLvl < 10) {
            System.out.println(genericStatus() + needsWater());
        } else {
            System.out.println(genericStatus() + noWater());
        }
    }


}
