package com.microservices.service2.demoservice2.controller;

import org.springframework.web.bind.annotation.RestController;
import com.microservices.service2.demoservice2.model.Profile;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/service2")
public class Service2Controller {

    @GetMapping(value = "/profiles/{id}")
    public Profile getProfile(@PathVariable("id") String id) {
        List<String> posts = Arrays.asList("post1", "post2", "post3");
        List<String> notifications = Arrays.asList("notify1", "notify2", "notify3");
        return new Profile(Integer.parseInt(id), posts, notifications);
    }
}
