package com.example.GitActions.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class controller {

    @GetMapping("/hello")
    public String get()
    {
        return "Hello World";
    }
}
