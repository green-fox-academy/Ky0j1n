package com.greenfox.restapp.service;

import com.greenfox.restapp.model.Doubling;
import org.springframework.stereotype.Service;

@Service
public class DoublingService {

 public Doubling getDoubled (Integer input) throws Exception {
    if(input == null) {
        throw new Exception();
    }
     return new Doubling(input);
 }


}
