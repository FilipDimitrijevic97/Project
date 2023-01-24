package com.example.demo;

@RestController
public class MainController {
    @GetMapping("/")
    public String index() {
        return "Welcome to my movie search app!";
    }
}
