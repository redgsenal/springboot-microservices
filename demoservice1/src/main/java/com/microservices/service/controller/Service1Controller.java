package com.microservices.service.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.service.model.Profile;
import com.microservices.service.model.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/service")
public class Service1Controller {

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") String id) {
        User user = new User(Integer.parseInt(id), "John Doe", "8090090293");
        RestTemplate restTemplate = new RestTemplate();
        Profile profile = restTemplate.getForObject("http://localhost:9001/service/profile/1", Profile.class);
        user.setProfile(profile);
        return user;
    }
}
