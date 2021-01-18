package com.greenfox.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Fox {
    String name;
    String food;
    String drink;
    List<String> tricks = new ArrayList<>();

}
