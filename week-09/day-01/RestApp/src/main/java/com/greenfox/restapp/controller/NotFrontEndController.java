package com.greenfox.restapp.controller;

import com.greenfox.restapp.error.ArrayError;
import com.greenfox.restapp.model.JArray;
import com.greenfox.restapp.service.ArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotFrontEndController {

    public ArrayService arrayService;

    @Autowired
    public NotFrontEndController(ArrayService arrayService) {
        this.arrayService = arrayService;
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> arrays(@RequestBody JArray jarray) {
        try {
            if(jarray.getWhat().equals("double")) {
                return new ResponseEntity<>(arrayService.integerArray(jarray), HttpStatus.OK);
            }else {
                return new ResponseEntity<>(arrayService.arraysActions(jarray), HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(new ArrayError(), HttpStatus.OK);
        }

    }
}
