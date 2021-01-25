package com.greenfox.restapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Append {
    String appended;

    public Append(String word){
        this.appended = word + "a";
    }
}
