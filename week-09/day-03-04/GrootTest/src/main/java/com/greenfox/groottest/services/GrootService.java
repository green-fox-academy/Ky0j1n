package com.greenfox.groottest.services;

import com.greenfox.groottest.error.NoInputException;
import com.greenfox.groottest.models.Groot;
import org.springframework.stereotype.Service;


@Service
public class GrootService {

    public Groot getTranslation(String message) throws NoInputException {
        if(message == null || message.equals("")){

            throw new NoInputException();
        }
        return new Groot(message);
    }

}
