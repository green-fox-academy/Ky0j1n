package com.greenfoxacademy.dice_set;
// You have a `DiceSet` class which has a list for 6 dice
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dice until all of the dice are 6

public class Main {
    public static void main(String[] args) {

        DiceSet diceSet = new DiceSet();
//        System.out.println(diceSet.getCurrent());
//        System.out.println(diceSet.roll());
//        System.out.println(diceSet.getCurrent());
//        System.out.println(diceSet.getCurrent(5));
//        diceSet.reroll();
//        System.out.println(diceSet.getCurrent());
//        diceSet.reroll(4);
//        System.out.println(diceSet.getCurrent());
            diceSet.roll();
        for (int i = 0; i < diceSet.size(); i++) {
            if(diceSet.getCurrent(i) != 6){
                do {
                    diceSet.reroll(i);
                }while(diceSet.getCurrent(i) != 6);
        }
            System.out.println(diceSet.getCurrent());
        }

    }

}
