package com.slaffka.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example2")
public class Example2Rest {

    @GetMapping
    public String getExample() {
        return "example";
    }
}
