package com.surya.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/first")
    public String firstMethod() {
        return "I am first method from first controller";
    }
}
