package com.greenfox.groottest.services;

import com.greenfox.groottest.error.NoInputException;
import com.greenfox.groottest.models.Arrow;
import org.springframework.stereotype.Service;

@Service
public class YonduService {

    public Arrow getSpeed(Double distance, Double time) throws NoInputException {
        if(distance == null || time == null || distance == 0 || time == 0 ){
            throw new NoInputException();
        }
        return new Arrow(distance,time);
    }

}
