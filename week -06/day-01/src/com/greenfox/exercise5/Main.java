package com.greenfox.exercise5;
//Exercise 5
//        Write a Stream Expression to get the sum of the odd numbers in the following list:


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .filter( number -> number % 2 != 0)
                .sum();

        System.out.println(sum);
    }
}
