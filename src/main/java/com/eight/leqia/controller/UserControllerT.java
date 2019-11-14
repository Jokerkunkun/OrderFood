package com.eight.leqia.controller;

import com.eight.leqia.entity.User;
import com.eight.leqia.service.UserServiceT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("qt")
public class UserControllerT {
    @Autowired
    private UserServiceT userService;
    @ResponseBody
    @RequestMapping("selAll")
    public List<User> selAll(){
        return userService.findAll();
    }
}
