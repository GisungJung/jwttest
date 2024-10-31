package com.gs.jwt.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JwtController {
    @GetMapping("/main")
    public String getMain(){
        return "main page";
    }
}
