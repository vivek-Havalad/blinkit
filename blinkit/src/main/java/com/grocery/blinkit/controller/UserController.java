package com.grocery.blinkit.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String test() {
        return "User API is working";
    }
}