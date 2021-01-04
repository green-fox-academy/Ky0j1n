package com.greenfox.exercise7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Exercise 7
//        Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
public class Main {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");


        System.out.println("Which letter should the city start with?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char character = input.charAt(0);

        cities.stream()
                .filter(city -> city.startsWith(String.valueOf(Character.toUpperCase(character))))
                .forEach(System.out::println);
    }
}
