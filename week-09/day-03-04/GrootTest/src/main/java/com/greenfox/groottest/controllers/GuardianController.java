package com.greenfox.groottest.controllers;


import com.greenfox.groottest.error.GrootError;
import com.greenfox.groottest.error.NoInputException;
import com.greenfox.groottest.models.Groot;
import com.greenfox.groottest.services.GrootService;
import com.greenfox.groottest.services.YonduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @Autowired
    GrootService grootService;
    @Autowired
    YonduService yonduService;

    @GetMapping("/groot")
    public ResponseEntity<?> grootTranslator(@RequestParam (required = false) String message) {
//        This is how u can send back nice exception message!!!!!!!!!!!!!!!!!!!!!

//        if(message == null || message.equals("")){
//            return new ResponseEntity<>(new NoInputException("I am Groot!").getMessage(), HttpStatus.BAD_REQUEST);
//        }
        Groot groot;
        try {
           groot = grootService.getTranslation(message);
        }catch (NoInputException e) {
            return new ResponseEntity<>(new GrootError(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(groot, HttpStatus.OK);
    }

    @GetMapping("/yondu")
    public ResponseEntity<?> speedOfTHeArrow(@RequestParam (required = false) Double distance, Double time) {
        try {
            return new ResponseEntity<>(yonduService.getSpeed(distance, time), HttpStatus.OK);
        }catch (NoInputException e) {
            return new ResponseEntity<>(new GrootError(), HttpStatus.BAD_REQUEST);
        }
    }

}
