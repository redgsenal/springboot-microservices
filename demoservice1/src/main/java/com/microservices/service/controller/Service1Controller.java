package com.microservices.service.controller;

import org.springframework.web.bind.annotation.RestController;

import com.microservices.service.model.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/service")
public class Service1Controller {

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") String id){
        User user = new User(Integer.parseInt(id), "John Doe", "8090090293");
        return user;
    }
}
