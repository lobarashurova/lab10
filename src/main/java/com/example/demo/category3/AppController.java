package com.example.demo.category3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @Value("${app.name}")
    private String appName;

    @GetMapping("/name")
    public String getAppName() {
        return "Application Name: " + appName;
    }
}

