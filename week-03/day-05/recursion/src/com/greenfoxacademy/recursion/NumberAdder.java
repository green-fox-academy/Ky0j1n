package com.greenfoxacademy.recursion;
// Write a recursive function that takes one parameter: n and
// adds numbers from 1 to n.
    public class NumberAdder {


    public static int addNumbers1ToN(int n){
        if(n == 1){
            return 1;
        }else{
            return n + addNumbers1ToN(n-1);

        }

    }

}
