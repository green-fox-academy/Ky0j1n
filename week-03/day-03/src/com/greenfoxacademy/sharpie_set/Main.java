package com.greenfoxacademy.sharpie_set;

import java.util.ArrayList;

//Reuse your Sharpie class
//Create SharpieSet class
//it contains a list of Sharpie
//                countUsable() -> sharpie is usable if it has ink in it
//        removeTrash() -> removes all unusable sharpies
public class Main {
    public static void main(String[] args){
        SharpieSet holder = new SharpieSet();
        Sharpie aoi = new Sharpie("blue",2);
        Sharpie yellow = new Sharpie("yellow", 0);
        Sharpie midori = new Sharpie("green",100);

        holder.add(aoi);
        holder.add(yellow);
        holder.add(midori);

            holder.removeTrash();
            
        for(Sharpie sharpie: holder.sharpieSet){
            System.out.println(sharpie.getInfo());
        }

    }

}
