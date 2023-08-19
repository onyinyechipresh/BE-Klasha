package com.CharlanBank.controller;

import com.CharlanBank.dtos.request.UserRequest;
import com.CharlanBank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/create_account")
    public ResponseEntity<?>createAccount(@RequestBody UserRequest userRequest){
        return new ResponseEntity<>(userService.createAccount(userRequest), HttpStatus.OK);
    }
}
