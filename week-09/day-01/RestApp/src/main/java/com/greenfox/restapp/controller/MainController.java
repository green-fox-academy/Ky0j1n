package com.greenfox.restapp.controller;


import com.greenfox.restapp.error.DoUntilError;
import com.greenfox.restapp.error.DoublingError;
import com.greenfox.restapp.error.GreeterError;
import com.greenfox.restapp.model.*;
import com.greenfox.restapp.model.Number;
import com.greenfox.restapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

   private DoublingService doublingService;
   private GreeterService greeterService;
   private AppendService appendService;
   private DoUntilService doUntilService;
   private LogService logService;

    @Autowired
    public MainController(DoublingService doublingService, GreeterService greeterService, AppendService appendService,DoUntilService doUntilService, LogService logService) {
        this.doublingService = doublingService;
        this.greeterService = greeterService;
        this.appendService = appendService;
        this.doUntilService = doUntilService;
        this.logService = logService;

    }


    @GetMapping("/doubling")
    public ResponseEntity<?> getDouble(@RequestParam(required = false) Integer input) {
        logService.saveLog("/doubling", "input=" + input);
        try {
            return new ResponseEntity<Doubling>(doublingService.getDoubled(input), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<DoublingError>(new DoublingError(), HttpStatus.OK);
        }

    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeter(@RequestParam(required = false) String name, String title) {
        logService.saveLog("/greeter", "name=" + name + ", title=" + title);
        try {
            return new ResponseEntity<Greeter>(greeterService.greet(name, title), HttpStatus.OK);
        } catch (Exception e) {
                return new ResponseEntity<GreeterError>(new GreeterError(name,title), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<Append> append(@PathVariable(required = false) String appendable) {
        logService.saveLog("/appenda/{appendable}", "appandable=" + appendable);
        try{
            return new ResponseEntity<Append>(appendService.append(appendable), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable String action, @RequestBody (required = false) Number until) {
        logService.saveLog("/dountil/{action}", "action=" + action + ", " + "until=" + until);
        try{
            return new ResponseEntity<>(doUntilService.action(action, until.getUntil()), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(new DoUntilError(),HttpStatus.OK);
        }

    }

}

