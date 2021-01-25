package com.greenfox.restapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class GreeterError {
    String error;

    public GreeterError(String name, String title){
        if(name == null && title == null){
            this.error = "Please provide a name and a title!" ;
        }else if (name == null){
            this.error = "Please provide a name!";
        }else{
            this.error = "Please provide a title!";
        }
    }

}
