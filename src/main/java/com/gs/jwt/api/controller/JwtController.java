package com.gs.jwt.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {
    @GetMapping("/api/main")
    public String getMain(){
        return "main page";
    }
}
