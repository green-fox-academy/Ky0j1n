package com.greenfox.restapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class JArray {
    String what;
    Integer[] numbers;

    public JArray(String what, Integer[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }


}
