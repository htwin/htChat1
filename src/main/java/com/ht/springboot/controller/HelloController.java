package com.ht.springboot.controller;

import com.ht.springboot.pojo.User;
import com.ht.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("user")
public class HelloController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("findOne")
    @ResponseBody
    public User findById(String id){
        User user = userService.findById(id);
        return user;

    }



    @GetMapping("list")
    @ResponseBody
    public List<User> userList(){
        return userService.userList();
    }

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello springboot";
    }



}
