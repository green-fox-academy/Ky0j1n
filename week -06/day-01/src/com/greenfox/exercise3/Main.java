package com.greenfox.exercise3;

import java.util.Arrays;
import java.util.List;

//Exercise 3
//        Write a Stream Expression to find which number squared value is more then 20 from the following list:
//
//        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers.stream()
                .filter(number -> number * number > 20)
                .forEach(System.out::println);


    }
}