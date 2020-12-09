package com.greenfox.testing.anagram;

import java.util.Arrays;

public class Anagram {


    public boolean isAnagram(String firstString, String secondString) {
        if (firstString == null || secondString == null) {
            throw new NullPointerException();
        }
        if (firstString.length() != secondString.length()) {
            return false;
        }

        char[] ch1 = new char[firstString.length()];
        for (int i = 0; i < firstString.length(); i++) {
            ch1[i] = firstString.charAt(i);
        }

        char[] ch2 = new char[secondString.length()];
        for (int i = 0; i < secondString.length(); i++) {
            ch2[i] = secondString.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
}

