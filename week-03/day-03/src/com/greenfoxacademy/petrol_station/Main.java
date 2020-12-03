package com.greenfoxacademy.petrol_station;
//Create Station and Car classes
//        Station
//        gasAmount
//        refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
//        Car
//        gasAmount
//        capacity
//        create constructor for Car where:
//        initialize gasAmount -> 0
//        initialize capacity -> 100

public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car(0, 100);

        Station petrolStation = new Station();
        petrolStation.refill(ferrari);
        System.out.println(petrolStation.gasAmount);
    }
}
