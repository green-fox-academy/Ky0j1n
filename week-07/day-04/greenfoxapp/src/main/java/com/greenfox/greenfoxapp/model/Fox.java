package com.greenfox.greenfoxapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fox {
    private String name;
    private Food food;
    private Drink drink;
    List<String> tricks = new ArrayList<>();

    public Fox (String name) {
        this.name = name;
    }

    public void addTrick(String trick) {
        tricks.add(trick);
    }
}
