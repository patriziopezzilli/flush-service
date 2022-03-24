package com.flush.flushservice.web;

import com.flush.flushservice.model.UserDTO;
import com.flush.flushservice.model.UsersDTO;
import com.flush.flushservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/flush/api/v1/user")
    public UserDTO join(@RequestBody UserDTO user) {
        return service.register(user);
    }

    @GetMapping("/flush/api/v1/user/login")
    public UserDTO login(@RequestParam String email, @RequestParam String password) {
        return service.login(email, password);
    }

    @GetMapping("/flush/api/v1/user")
    public UserDTO get(@RequestParam(required = false) String email, @RequestParam(required = false) String username) {
        return service.getUser(email, username);
    }

    @GetMapping("/flush/api/v1/user/classification")
    public UsersDTO get() {
        return service.getClassification();
    }
}
