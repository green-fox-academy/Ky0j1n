package com.greenfoxacademy.recursion.sumdigit;
// Given a non-negative integer n, return the sum of it's digits recursively
// (without loops).
//
// Hint
//
// Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//
// Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

import java.util.ArrayList;


public class SumDigit {

    public static int sumDigit(int n) {
            ArrayList<Integer> Sumednumbers = new ArrayList<>();

        int sumedDigit = 0;
        if (n != 0) {

            sumedDigit += n % 10;

            return sumedDigit +  sumDigit(n/10);
        } else {

            return sumedDigit;
        }

    }
}
