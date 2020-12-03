package com.greenfoxacademy.sharpie_set;

import java.util.ArrayList;

//Reuse your Sharpie class
//Create SharpieSet class
//it contains a list of Sharpie
//                countUsable() -> sharpie is usable if it has ink in it
//        removeTrash() -> removes all unusable sharpies
public class SharpieSet {
           ArrayList<Sharpie> sharpieSet = new ArrayList<>();


        public int countUsable() {
            int amount = 0;
            for (Sharpie sharpies : sharpieSet) {
                if (sharpies.inkAmount > 0) {
                    amount++;
                }
            }
            return amount;
        }

        public void removeTrash(){
            for(int i = 0; i < sharpieSet.size(); i++){
                if(sharpieSet.get(i).inkAmount <= 0){
                    sharpieSet.remove(i);
                }
            }

        }

        public void add(Sharpie sharpiename){

            sharpieSet.add(sharpiename);
         }

}
