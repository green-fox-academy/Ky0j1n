package com.greenfox.restapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Doubling {
   public Integer received;
   public Integer result;

   public Doubling (Integer input) {
      this.received = input;
      this.result = (input * 2);
   }
}
