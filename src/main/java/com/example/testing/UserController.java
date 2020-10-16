package com.example.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("user/{id}")
    public User get(@PathVariable Long id) {
        return userService.getById(id);
    }
}
