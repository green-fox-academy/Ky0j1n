package com.greenfox.inheritance.garden_app;

import java.util.ArrayList;

public class Garden {

    ArrayList<Plant> garden = new ArrayList<>();

    public void addFlower(Flower flower) {
        garden.add(flower);
    }

    public void addTree(Tree tree) {
        garden.add(tree);
    }

    public void status() {
        for (Plant plant : garden) {
            plant.status();
        }
    }

    public int divider() {
        int divide = 0;

        for (Plant plant : garden) {
            if (plant.isThirsty()) {
                divide++;
            }
        }
        return divide;
    }


    public void watering(int amountOfWater) {
        int divider = divider();
        for (Plant plant : garden) {
            if (plant.isThirsty()) {
                plant.waterLvl += ((amountOfWater / (divider)) * plant.getAbsorbtionLvl());
            }
        }
    }


}

