package com.greenfox.groottest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Groot {
    String received;
    String translated = "I am Groot!";

    public Groot (String message) {
        this.received = message;
    }
}
