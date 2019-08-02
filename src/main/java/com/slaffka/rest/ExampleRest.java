package com.slaffka.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleRest {

    @GetMapping
    public String getExample() {
        System.out.println("example");
        return "hello, Yulia";
    }
}
