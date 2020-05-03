package com.angel.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@CrossOrigin
public class HomeController {
    
    @GetMapping(value="/")
    public String home() {
        return "Hola Mundo desde Spring Boot";
    }
    
}