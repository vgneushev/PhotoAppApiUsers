package com.photoapp.api.users.photoappapiusers.ui.controllers;

import com.photoapp.api.users.photoappapiusers.ui.models.CreateUserRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private Environment environment;

    @GetMapping("/status/check")
    public String status() {
        return "Working on port: " + environment.getProperty("local.server.port");
    }


    @PostMapping
    public String createUser(@Valid @RequestBody final CreateUserRequest createUserRequest) {
        return "CreateUser call " + createUserRequest;
    }
}
