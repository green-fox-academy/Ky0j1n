package com.greenfox.restapp.service;

import com.greenfox.restapp.model.Append;
import com.greenfox.restapp.model.Doubling;
import org.springframework.stereotype.Service;

@Service
public class AppendService {

    public Append append(String word) throws Exception {
        if (word == null) {
            throw new Exception();
        }
        return new Append(word);
    }
}
