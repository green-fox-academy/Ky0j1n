package com.greenfoxacademy.recursion.power;
// Given base and n that are both 1 or more, compute recursively (no loops) the
// value of base to the n power, so powerN(3, 2) is 9 (3 squared).
public class Power {
    public static int powerN(int base,int onN){
        int result = 0;
        int baseNumber = base;

        if(onN != 0){
            result = baseNumber * base;
            return  result + powerN(base-base,onN-1);
        }else{
            return  result;
        }
    }
}
