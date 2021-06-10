package com.javatechie.spring.auth.example.controller;

import com.javatechie.spring.auth.example.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @GetMapping("/")
    public String login(){
        return "authenticated successfully" ;
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return Stream.of(new User(101,"Ronaldo","cr7@gmail.com","07070707070707"),
                new User(102,"Messi","lm10@gmail.com","101010101010")).
                collect(Collectors.toList());
    }
}
