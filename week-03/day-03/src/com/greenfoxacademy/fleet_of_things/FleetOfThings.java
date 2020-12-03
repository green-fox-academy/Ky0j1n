package com.greenfoxacademy.fleet_of_things;

// - You have the `Thing` class
// - You have the `Fleet` class
// - You have the `FleetOfThings` class with a `main` method
// - Download those, use those
// - In the main method create a fleet
// - Achieve this output:
// Create a fleet of things to have this output:
// 1. [ ] Get milk
// 2. [ ] Remove the obstacles
// 3. [x] Stand up
// 4. [x] Eat lunch
public class FleetOfThings {

    public static void main(String[] args) {
        String milk = "Get milk";
        String remove = "Remove the obastacle";
        String stand = "Stand up";
        String eat = "Eat lunch";
// Why i cant  ?
// String milk = "Get milk"
//        new Thing(milk);
//        fleet.add(milk);

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
