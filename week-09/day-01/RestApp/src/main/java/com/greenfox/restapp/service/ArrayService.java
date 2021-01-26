package com.greenfox.restapp.service;

import com.greenfox.restapp.model.ArrayResultInteger;
import com.greenfox.restapp.model.ArrayResultIntegerArray;
import com.greenfox.restapp.model.JArray;
import org.springframework.stereotype.Service;

@Service
public class ArrayService {

    public ArrayResultInteger arraysActions(JArray jArray) throws Exception {
        if (jArray.getWhat() == null) {
            throw new Exception();
        } else if(!jArray.getWhat().equals("double")){
            return new ArrayResultInteger(jArray);
        }
     return null;
    }

    public ArrayResultIntegerArray integerArray(JArray jArray) {
        return new ArrayResultIntegerArray(jArray);
    }

}
