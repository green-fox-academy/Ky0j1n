package com.greenfox.restapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


import java.sql.Timestamp;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Log {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;
    @Transient
    java.util.Date date = new Date();
    Timestamp createdAT = new Timestamp(date.getTime());
    String endpoint;
    String data;

    public Log(String endpoint, String input  ) {
        this.endpoint = endpoint;
        this.data = input;
    }
}
