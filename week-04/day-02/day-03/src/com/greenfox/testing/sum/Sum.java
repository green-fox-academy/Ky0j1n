package com.greenfox.testing.sum;

import java.util.ArrayList;

public class Sum {

    public  int sumArray(ArrayList <Integer> arrayList) {
        int sum = 0;
        for (Integer number : arrayList) {
            if(number == null){throw new NullPointerException();}
            sum += number;
        }
        return sum;
    }

}
