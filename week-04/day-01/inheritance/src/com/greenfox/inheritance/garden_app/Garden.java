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

    public int divider(int amountOfWater) {
        int divide = 0;
        for (Plant plant : garden) {

            if (plant.type.equals("flower") && plant.waterLvl < 5) {
                divide++;

            }
            if (plant.type.equals("tree") && plant.waterLvl < 10) {
                divide++;
            }
        }
        return divide;
    }


    public void watering(int amountOfWater) {
        for (Plant plant : garden) {
            if (plant.type.equals("flower") && plant.waterLvl < 5) {
                plant.waterLvl += ((amountOfWater / (divider(amountOfWater))) * 0.75);
            }
            if (plant.type.equals("tree") && plant.waterLvl < 10) {
                plant.waterLvl += ((amountOfWater / (divider(amountOfWater))) * 0.40);
            }
        }
    }


}

