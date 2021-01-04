package com.greenfox.exercise4;
//Exercise 4
//        Write a Stream Expression to get the average value of the odd numbers from the following list:


import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .filter(number -> number % 2 != 0)
                .average();

        if (average != null) {
            System.out.println(average);
        } else {
            System.out.println("Something went wrong!");
        }
    }
}
