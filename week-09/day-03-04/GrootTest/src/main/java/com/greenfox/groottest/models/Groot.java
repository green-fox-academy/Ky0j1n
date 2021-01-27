package com.greenfox.groottest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Groot {
   private String received;
   private String translated = "I am Groot!";

    public Groot (String message) {
        this.received = message;
    }
}
