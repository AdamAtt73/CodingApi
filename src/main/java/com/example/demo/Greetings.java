package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {


    @GetMapping("/api/testExceptionHandling")
    public String api(@RequestParam int code) {
        if(code == 404) {
            return "errorMessage: resource not found";
        } else
            return "errorMessage: You are not authorized";
    }
}
