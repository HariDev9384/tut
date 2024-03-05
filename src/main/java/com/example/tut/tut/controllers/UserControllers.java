package com.example.tut.tut.controllers;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserControllers {
    @GetMapping("/demo")
    public String get(@RequestParam String id) {
        return id;
    }
    
}
