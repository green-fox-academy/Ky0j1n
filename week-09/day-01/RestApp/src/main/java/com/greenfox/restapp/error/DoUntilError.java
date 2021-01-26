package com.greenfox.restapp.error;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoUntilError {
    String error = "Please provide a number!";
}
