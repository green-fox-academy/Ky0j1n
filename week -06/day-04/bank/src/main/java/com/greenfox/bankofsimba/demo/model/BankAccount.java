package com.greenfox.bankofsimba.demo.model;

import java.text.DecimalFormat;

public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;
    private Boolean isKing;


    public BankAccount(String name, Double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public BankAccount(String name, Double balance, String animalType, Boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return String.format("%.2f",balance) + " Zebra";

    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public Boolean getIsKing() {
        return isKing;
    }

    public void setIsKing(Boolean king) {
        isKing = king;
    }
}
