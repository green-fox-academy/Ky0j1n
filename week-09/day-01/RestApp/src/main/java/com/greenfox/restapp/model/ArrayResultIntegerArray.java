package com.greenfox.restapp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ArrayResultIntegerArray {
    Integer[] result;

    public ArrayResultIntegerArray(JArray jArray) {
        this.result = doubleit(jArray.getNumbers());
    }

    private Integer[] doubleit(Integer[] numbers) {
        Integer[] result = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = (numbers[i] * 2);
        }

        return result;
    }
}
