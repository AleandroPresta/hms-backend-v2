package com.example.hms.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("api/v1/welcome")
    public String welcome() {
        return "Welcome to HMS";
    }
    
}
