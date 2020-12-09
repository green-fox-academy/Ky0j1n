package com.greenfox.testing.anagram;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram test;

    @Before
    public void setup() {
        test = new Anagram();
    }

    @Test
    public void happyCase() {
        String test1 = "lol";
        String test2 = "lol";
        boolean expected = true;
        boolean actual = test.isAnagram(test1,test2);
        assertEquals(expected,actual);
    }

    @Test
    public void oneWordLonger() {
        String test1 = "loll";
        String test2 = "lol";
        boolean expected = false;
        boolean actual = test.isAnagram(test1,test2);
        assertEquals(expected,actual);
    }

    @Test
    public void sameLengthDifferentWord() {
        String test1 = "bob";
        String test2 = "lol";
        boolean expected = false;
        boolean actual = test.isAnagram(test1,test2);
        assertEquals(expected,actual);
    }


  
    @Test(expected = NullPointerException.class)
    public void aNull(){
        String test1 = "bob";
        String test2 = null;
       test.isAnagram(test1,test2);

    }
}