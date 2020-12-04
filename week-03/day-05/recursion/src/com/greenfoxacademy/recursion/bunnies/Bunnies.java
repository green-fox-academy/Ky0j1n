package com.greenfoxacademy.recursion.bunnies;

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears
// across all the bunnies recursively (without loops or multiplication).
public class Bunnies {
    public static int earsCounter(int numberOfBunnies) {
        int sumOfEars = 0;
        int amountOfEars = 2;

        if (numberOfBunnies != 0){
            sumOfEars += amountOfEars;
            return sumOfEars + earsCounter(numberOfBunnies - 1);
        }else{
            return sumOfEars;
        }
    }

}
