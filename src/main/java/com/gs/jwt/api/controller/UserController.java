package com.gs.jwt.api.controller;

import com.gs.jwt.api.dto.UserDto;
import com.gs.jwt.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> userSave(@RequestBody UserDto userDto){
        userService.saveUser(userDto);
        return new ResponseEntity<>("User saved successfully", HttpStatus.CREATED);
    }
}
