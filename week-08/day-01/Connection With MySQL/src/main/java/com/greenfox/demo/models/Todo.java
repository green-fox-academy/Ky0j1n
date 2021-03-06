package com.greenfox.demo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Boolean urgent = false;
    private Boolean done = false;

    public Todo(String title) {
        this.title = title;
    }

    public Todo(String title, Boolean done, Boolean urgent) {
        this.title = title;
        this.done = done;
        this.urgent = urgent;
    }
}
