package com.vamshi.libraryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LibraryController {

    @GetMapping("/getAllBooksBorrowed")
    public String getLibrary() {
        return "Hello World";
    }

}
