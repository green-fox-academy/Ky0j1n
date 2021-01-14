package com.greenfox.greenfoxapp.service;

import com.greenfox.greenfoxapp.model.Drink;
import com.greenfox.greenfoxapp.model.Food;
import com.greenfox.greenfoxapp.model.Fox;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class FoxServices {
    public List<Fox> foxList = new ArrayList<>();


    public Fox getFox(String name) {

         Optional<Fox> usersFox = foxList.stream()
                .filter(fox -> fox.getName()
                        .equals(name))
                        .findFirst();

            if(usersFox.isPresent()) {
                return usersFox.get();
            }
       return null;
    }

    public void addFox(String name) {
        foxList.add(new Fox(name));
    }

    public List<String> getFoodList() {
        return Arrays.stream(Food.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }
    public List<String> getDrinkList() {
        return Arrays.stream(Drink.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }

    public void setDrink(Fox fox, Drink drink) {
        fox.setDrink(drink);
    }
    public void setFood(Fox fox, Food food) {
        fox.setFood(food);
    }

}
