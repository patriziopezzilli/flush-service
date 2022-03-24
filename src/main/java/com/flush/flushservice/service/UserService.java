package com.flush.flushservice.service;

import com.flush.flushservice.model.UserDTO;
import com.flush.flushservice.model.UsersDTO;
import com.flush.flushservice.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO register(UserDTO user){

        return null;
    }

    public UserDTO login(String email, String password) {

        return null;
    }

    public UserDTO getUser(String email, String username) {

        return null;
    }

    public UsersDTO getClassification() {

        return null;
    }
}
