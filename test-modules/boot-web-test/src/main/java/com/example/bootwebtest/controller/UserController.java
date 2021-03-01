package com.example.bootwebtest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/v1/{id}")
    public String queryUser(@PathVariable("id") int id) {
        return String.format("{\"name\":\"Lily\", \"id\":%d}", id);
    }
}
