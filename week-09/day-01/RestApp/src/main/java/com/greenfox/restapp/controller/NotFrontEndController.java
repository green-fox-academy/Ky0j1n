package com.greenfox.restapp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfox.restapp.error.ArrayError;
import com.greenfox.restapp.model.JArray;
import com.greenfox.restapp.service.ArrayService;
import com.greenfox.restapp.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotFrontEndController {

    public ArrayService arrayService;
    LogService logService;
    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public NotFrontEndController(ArrayService arrayService, LogService logService) {
        this.arrayService = arrayService;
        this.logService = logService;
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> arrays(@RequestBody JArray jarray)  {

        try {
            logService.saveLog("/arrays", objectMapper.writeValueAsString(jarray));
            if(jarray.getWhat().equals("double")) {
                return new ResponseEntity<>(arrayService.integerArray(jarray), HttpStatus.OK);
            }else {
                return new ResponseEntity<>(arrayService.arraysActions(jarray), HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(new ArrayError(), HttpStatus.OK);
        }

    }

//    @GetMapping("/log") {
//        public String logCount(){
//            logService.countAllEntries();
//            return
//        }
//    }
}
