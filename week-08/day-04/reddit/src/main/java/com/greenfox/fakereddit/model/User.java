package com.greenfox.fakereddit.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;

    @OneToMany(cascade = CascadeType.ALL)

    private List<Post> postList = new ArrayList<>();

    public User (String userName, String password ){
        this.userName = userName;
        this.password = password;
    }
}
