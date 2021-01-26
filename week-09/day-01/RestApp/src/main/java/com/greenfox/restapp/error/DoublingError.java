package com.greenfox.restapp.error;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoublingError {
    String error = "Please provide an input!";
}
