package com.greenfox.exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Exercise 8
//        Write a Stream Expression to concatenate a Character list to a string!
public class Main {
    public static void main(String[] args) {
        List<Character> testList = new ArrayList<>();
        testList.add('f');
        testList.add('a');
        testList.add('i');
        testList.add('t');
        testList.add('h');

        String word = testList.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining());

        System.out.println(word);

    }
}
