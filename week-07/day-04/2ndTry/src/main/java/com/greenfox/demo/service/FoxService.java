package com.greenfox.demo.service;

import com.greenfox.demo.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;

@Service
public class FoxService {
    List<Fox> foxList = new ArrayList<>();

    public void addNewFoxIfNotExist(String name) {
        if(getFox(name) == null) {
            addNewFox(name);
        }
    }
    private void addNewFox(String name) {
        foxList.add(new Fox(name, "c", "cc",new ArrayList<>()));
    }

    public Fox getFox(String name) {
        Optional<Fox> usersFox = foxList.stream()
                .filter(fox -> fox.getName()
                        .equals(name)).findFirst();

        if (usersFox.isPresent()) {
            return usersFox.get();
        }
        return null;
    }
}
