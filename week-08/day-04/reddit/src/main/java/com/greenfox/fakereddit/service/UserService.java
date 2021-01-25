package com.greenfox.fakereddit.service;

import com.greenfox.fakereddit.model.User;
import com.greenfox.fakereddit.repositrorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addNewUser (String username, String password) {
        userRepository.save(new User(username,password));
    }


}
