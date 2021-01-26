package com.greenfox.restapp.service;

import com.greenfox.restapp.model.DoUntil;
import org.springframework.stereotype.Service;

@Service
public class DoUntilService {

    public DoUntil action(String action, Integer number) throws Exception {
        if (number == null) {
            throw new Exception();
        } else if (action.equals("sum")) {
            DoUntilService sum = new DoUntilService();
            return sum.sum(number);
        } else if (action.equals("factor")) {
            DoUntilService factor = new DoUntilService();
            return factor.factor(number);
        }
        return null;
    }

    private DoUntil sum(Integer number) {
        Integer sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return new DoUntil(sum);
    }

    public DoUntil factor(Integer number) {
        Integer factor = 1;
        for (int i = 1; i <= number; i++) {
            factor *= i;
        }
        return new DoUntil(factor);
    }
}
