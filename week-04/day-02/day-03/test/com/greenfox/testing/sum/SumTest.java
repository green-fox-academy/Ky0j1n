package com.greenfox.testing.sum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
//Create a sum method in your class which has an ArrayList of Integers as parameter
//        It should return the sum of the elements in the list
//        Follow these steps:
//        Add a new test case
//        Instantiate your class
//create a list of integers
//                use the assertEquals to test the result of the created sum method
//                Run them
//                Create different tests where you test your method with:
//        an empty list
//        a list that has one element in it
//        a list that has multiple elements in it
//        a null
//        Run them
//        Fix your code if needed

public class SumTest {
    Sum sumTest;

    ArrayList<Integer> numbers = new ArrayList<>();


    @Before
    public void setup() {
        sumTest = new Sum();
    }

    @Test
    public void sumArrayTest() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        int expected = 10;
        int actual = sumTest.sumArray(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void emptyArray() {
        ArrayList<Integer> empty = new ArrayList<>();
        int expected = 0;
        int actual = sumTest.sumArray(empty);
        assertEquals(expected,actual);
    }

    @Test
    public void vanElement() {
        ArrayList<Integer> van = new ArrayList<>();
        van.add(1);
        int expected = 1;
        int actual = sumTest.sumArray(van);
        assertEquals(expected,actual);
    }

    @Test(expected = NullPointerException.class)
    public void aNull(){
        ArrayList<Integer> aNull = new ArrayList<>();
        aNull.add(null);
         sumTest.sumArray(aNull);

    }
}