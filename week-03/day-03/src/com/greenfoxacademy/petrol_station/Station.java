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

public class Station {
    int gasAmount = 1000;

    public void refill(Car whichCar) {
        new Car(whichCar.gasAmount, whichCar.capacity);
        gasAmount = gasAmount - whichCar.capacity;
    }

}
