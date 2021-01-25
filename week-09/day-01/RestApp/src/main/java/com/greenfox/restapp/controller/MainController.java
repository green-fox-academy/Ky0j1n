package com.greenfox.restapp.controller;


import com.greenfox.restapp.model.Doubling;
import com.greenfox.restapp.model.Error;
import com.greenfox.restapp.service.DoublingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    DoublingService doublingService;

    @Autowired
    public MainController(DoublingService doublingService) {
        this.doublingService = doublingService;
    }


    @GetMapping("/doubling")
    public ResponseEntity<?> getDouble(@RequestParam (required = false) Integer input) {
      try {
         return new ResponseEntity<Doubling> (doublingService.getDoubled(input), HttpStatus.OK);
      }catch (Exception e) {
          return new  ResponseEntity<Error> (new Error(), HttpStatus.OK);
      }
    }

    @GetMapping("/greeter")
    public 
}
