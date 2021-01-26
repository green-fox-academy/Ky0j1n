package com.greenfox.restapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArrayResultInteger {

    String result;

    public ArrayResultInteger(JArray jArray) {
        this.result = arrayHandler(jArray);
    }

    private String arrayHandler(JArray jarray) {
        if (jarray.getWhat().equals("sum")) {
            return sum(jarray.getNumbers());
        } else if (jarray.getWhat().equals("multiply")) {
            return multiply(jarray.getNumbers());
        }
        return null;
    }

    private String sum(Integer[] numbers) {
        Integer result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result.toString();

    }

    private String multiply(Integer[] numbers) {
        Integer result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result *= numbers[i];
        }
        return result.toString();
    }


}