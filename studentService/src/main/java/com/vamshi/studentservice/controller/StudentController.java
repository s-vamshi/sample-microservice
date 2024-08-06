package com.vamshi.studentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class StudentController {



    @GetMapping("/all")
    public String getBooksOwnedByAllStudents(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://library-service:8092/api/getAllBooksBorrowed", String.class);
    }
}
