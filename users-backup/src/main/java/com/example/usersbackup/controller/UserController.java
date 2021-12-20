package com.example.usersbackup.controller;


import com.example.usersbackup.domain.User;
import com.example.usersbackup.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/users")
    public List<User> users(){
        System.out.println("2");
        return userMapper.findAll();
    }

}
