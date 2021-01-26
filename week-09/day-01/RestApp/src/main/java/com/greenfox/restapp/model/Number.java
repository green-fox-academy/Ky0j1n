package com.greenfox.restapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Number {
    Integer until;

    public Number(Integer until) {
        this.until = until;
    }
}
