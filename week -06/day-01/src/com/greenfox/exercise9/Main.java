package com.greenfox.exercise9;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Exercise 9
//        Write a Stream Expression to find the frequency of characters in a given string!
public class Main {
    public static void main(String[] args) {

        String test ="hasami";

            Map<Character, Integer> frequencyOfCharacter = test.chars()
                                                                .mapToObj(character -> (char) character)
                                                                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(character -> 1)));

        frequencyOfCharacter.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

    }
}
