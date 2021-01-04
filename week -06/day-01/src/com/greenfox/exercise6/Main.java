package com.greenfox.exercise6;

import java.util.stream.Collectors;

//Exercise 6
//        Write a Stream Expression to find the uppercase characters in a string!
public class Main {
    public static void main(String[] args) {
        String test = "KeCskE";

                test.chars()
                .mapToObj(element -> (char) element)
                .filter(Character::isUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
