package com.greenfox.restapp.service;

import com.greenfox.restapp.model.Doubling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DoublingService {

 public Doubling getDoubled (Integer input) throws Exception {
    if(input == null) {
        throw new Exception();
    }
         Doubling doubling = new Doubling(input);
         return doubling;
 }

}
