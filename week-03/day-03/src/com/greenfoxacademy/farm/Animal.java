package com.greenfoxacademy.farm;
//Reuse your Animal class
//Create a Farm class
//it has list of Animals
//                it has slots which defines the number of free places for animals
//        breed() -> creates a new animal if there's place for it
//        slaughter() -> removes the least hungry animal
public class Animal {
    int hunger;
    int thirst;


    public Animal() {
        hunger = 50;
        thirst = 50;
    }

    public void eat() {
        hunger--;
    }

    public void  drink(){
        thirst--;
    }

    public void play(){
        hunger++;
        thirst++;
    }
}
