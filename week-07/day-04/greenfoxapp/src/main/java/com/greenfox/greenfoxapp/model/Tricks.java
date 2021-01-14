package com.greenfox.greenfoxapp.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Tricks {
    List<String> tricksList = new ArrayList<>();

    public Tricks() {
        tricksList.add("Change penis size");
        tricksList.add("Tuff");
        tricksList.add("Make things to future Glados problem");
    }

}
