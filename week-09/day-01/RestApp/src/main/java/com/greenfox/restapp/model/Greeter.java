package com.greenfox.restapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
public class Greeter {

    @JsonProperty(value = "welcome_message")
    String welcomeMessage;
    public Greeter(String name, String title){
       this.welcomeMessage =  "Oh, hi there " + name + ", my dear " + title + "!";
    }




}
