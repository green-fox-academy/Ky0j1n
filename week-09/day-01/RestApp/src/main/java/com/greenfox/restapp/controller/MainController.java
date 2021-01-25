package com.greenfox.restapp.controller;


import com.greenfox.restapp.model.Doubling;
import com.greenfox.restapp.model.DoublingError;
import com.greenfox.restapp.model.Greeter;
import com.greenfox.restapp.model.GreeterError;
import com.greenfox.restapp.service.DoublingService;
import com.greenfox.restapp.service.GreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    DoublingService doublingService;
    GreeterService greeterService;

    @Autowired
    public MainController(DoublingService doublingService, GreeterService greeterService) {
        this.doublingService = doublingService;
        this.greeterService = greeterService;
    }


    @GetMapping("/doubling")
    public ResponseEntity<?> getDouble(@RequestParam(required = false) Integer input) {
        try {
            return new ResponseEntity<Doubling>(doublingService.getDoubled(input), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<DoublingError>(new DoublingError(), HttpStatus.OK);
        }
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeter(@RequestParam(required = false) String name, String title) {
        try {
            return new ResponseEntity<Greeter>(greeterService.greet(name, title), HttpStatus.OK);
        } catch (Exception e) {
            if (name == null && title == null) {
                return new ResponseEntity<GreeterError>(new GreeterError().emptyNameTitle(), HttpStatus.BAD_REQUEST);
            }
            if (name == null && title != null) {
                return new ResponseEntity<GreeterError>(new GreeterError().noName(), HttpStatus.BAD_REQUEST);
            }
            if (name != null && title == null) {
                return new ResponseEntity<GreeterError>(new GreeterError().noTitle(), HttpStatus.BAD_REQUEST);
            }
        }
        return null;
    }
}

