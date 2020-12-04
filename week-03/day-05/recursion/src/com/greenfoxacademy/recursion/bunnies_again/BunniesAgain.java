package com.greenfoxacademy.recursion.bunnies_again;

import java.sql.SQLOutput;
import java.util.ArrayList;

// We have bunnies standing in a line,
// numbered 1, 2, 3, 4, ...
// The odd bunnies (1, 3, ...) have the normal 2 ears.
// The even bunnies (2, 4, ..) we'll say have 3 ears,
// because they each have a raised foot.
// Recursively return the number of "ears" in
// the bunny line 1, 2, ... n (without loops or multiplication).
public class BunniesAgain {
    public static int oddEvenEarCounter(int amountOfBunniesInLine) {
        int oddBunniesEarCounter = 0;
        int oddEars = 3;
        int evenBunniesEarCounter = 0;
        int evenEars = 2;

        if (amountOfBunniesInLine % 2 == 0 && amountOfBunniesInLine >= 1) {

            evenBunniesEarCounter += evenEars;
            return evenBunniesEarCounter + oddEvenEarCounter(amountOfBunniesInLine - 1);

        } else if (amountOfBunniesInLine % 2 != 0 && amountOfBunniesInLine >= 1) {

            oddBunniesEarCounter += oddEars;
            return oddBunniesEarCounter + oddEvenEarCounter(amountOfBunniesInLine - 1);

        }else{
            return  oddBunniesEarCounter + evenBunniesEarCounter;
        }

    }
}
