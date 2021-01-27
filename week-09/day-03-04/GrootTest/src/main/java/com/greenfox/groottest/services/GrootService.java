package com.greenfox.groottest.services;

import com.greenfox.groottest.error.NoInputException;
import com.greenfox.groottest.models.Groot;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
public class GrootService {

    public Groot getTranslation(String message) throws NoInputException {
        if(message == null || message.equals("")){

            throw new NoInputException();
        }
        return new Groot(message);
    }

}
