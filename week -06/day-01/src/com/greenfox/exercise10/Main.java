package com.greenfox.exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
//
//        Write a Stream Expression to find the foxes with green color!
//        Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//        Write a Stream Expression to find the frequency of foxes by color!
public class Main {
    public static void main(String[] args) {
        List<Fox> testKennel = new ArrayList<>();
        Fox fox = new Fox("Vuk", "blue", 6);
        Fox fox2 = new Fox("Vuk2", "green", 3);
        Fox fox3 = new Fox("Vuk3", "blue", 2);
        Fox fox4 = new Fox("Vuk4", "green", 6);
        Fox fox5 = new Fox("Vuk5", "blue", 1);
        Fox fox6 = new Fox("Vuk6", "yellow", 10);
        testKennel.add(fox);
        testKennel.add(fox2);
        testKennel.add(fox3);
        testKennel.add(fox4);
        testKennel.add(fox5);
        testKennel.add(fox6);

        System.out.println("Green colored foxes:");
        testKennel.stream()
                .filter(animal -> animal.getColor() == "green")
                .forEach(animal -> System.out.println(animal.getName()));

        System.out.println("--------------------------------------------------");
        System.out.println("Green colored foxes and age younger than 5 :");
        testKennel.stream()
                .filter(animal -> animal.getColor() == "green")
                .filter(animal -> animal.getAge() < 5)
                .forEach(animal -> System.out.println(animal.getName()));

        Map<String, Integer> colorCounterMap = testKennel.stream()
                                                .collect(Collectors.groupingBy(Fox::getColor, Collectors.summingInt(counter -> 1)));

        System.out.println("----------------------------------------------------");
        System.out.println("What color, how many fox:");
        colorCounterMap.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });



    }

}
