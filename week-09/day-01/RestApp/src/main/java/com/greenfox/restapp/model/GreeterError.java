package com.greenfox.restapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class GreeterError {
    String error;

    public GreeterError(String error){
        this.error = error;
    }
    public GreeterError emptyNameTitle(){
        GreeterError emptyNameTitle = new GreeterError("Please provide a name and a title!");
        return emptyNameTitle;
    }

    public GreeterError noTitle(){
        GreeterError noTitle = new GreeterError("Please provide a title!");
        return noTitle;
    }

    public GreeterError noName(){
        GreeterError noName = new GreeterError("Please provide a name!");
        return noName;
    }
}
