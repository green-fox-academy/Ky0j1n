package com.greenfoxacademy.domino;

import java.util.*;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        List<Domino> dominoesInOrder = new ArrayList<>();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        dominoesInOrder.add(dominoes.get(0));
        int j = 0;
        do {

            for (int i = 0; i < dominoes.size(); i++) {
                
                if (dominoes.get(i).getLeftSide() == dominoesInOrder.get(j).getRightSide()) {
                    dominoesInOrder.add(dominoes.get(i));
                    j++;
                }
            }
        } while (dominoes.size() != dominoesInOrder.size());
        System.out.println(dominoesInOrder);
    }


    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}

