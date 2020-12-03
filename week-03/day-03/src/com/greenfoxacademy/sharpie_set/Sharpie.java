package com.greenfoxacademy.sharpie_set;
//Reuse your Sharpie class
//Create SharpieSet class
//it contains a list of Sharpie
//                countUsable() -> sharpie is usable if it has ink in it
//        removeTrash() -> removes all unusable sharpies
public class Sharpie {
    String color;
    String name;
    float inkAmount = 100;


    public  Sharpie(String color, float inkAmount){
           this.color = color;
           this.inkAmount = inkAmount;

    }

    public void use(){
        inkAmount -=20;
    }

    public String getInfo(){
        return this.color.toString() +" " + this.inkAmount;
    }


}