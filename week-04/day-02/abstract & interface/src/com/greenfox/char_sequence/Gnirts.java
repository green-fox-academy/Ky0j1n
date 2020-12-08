package com.greenfox.char_sequence;

public class Gnirts implements CharSequence {
    String word;

    public Gnirts() {
        word = "example";
    }

    public static void main(String[] args) {
        Gnirts word = new Gnirts();
        System.out.println(word.length());
    }

    public String reversedWord(String word) {
        this.word = word;

    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        return 0;
    }


    @Override
    public CharSequence subSequence(int start, int end) {
        int wordEnd = start;
        int wordStart = end;
        return  

    }
}
