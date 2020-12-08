package com.greenfox.comparable;

import java.util.Collection;
import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {
        String milk = "Get milk";
        String remove = "Remove the obstacle";
        String stand = "Stand up";
        String eat = "Eat lunch";


        Thing firstElement = new Thing(stand);
        Thing secondElement = new Thing(eat);
        Thing thirdElement = new Thing(stand);
        Thing fourthElement = new Thing(eat);

        thirdElement.complete();
        fourthElement.complete();

        Fleet fleet = new Fleet();
        fleet.add(firstElement);
        fleet.add(secondElement);
        fleet.add(thirdElement);
        fleet.add(fourthElement);
        System.out.println(fleet);



    }
}
