package com.greenfox.restapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoUntil {
   private Integer result;

    public DoUntil(Integer result) {
        this.result = result;
    }

}
