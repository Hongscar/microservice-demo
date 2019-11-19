package com.example.microservicesimpleconsumermovie.controller;

import com.example.microservicesimpleconsumermovie.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Seth
 * @Description:
 * @Date: Created in 16:43 2019/11/19
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Integer id) {
        return restTemplate.getForObject("http://localhost:8000/" + id, User.class);
    }

}
