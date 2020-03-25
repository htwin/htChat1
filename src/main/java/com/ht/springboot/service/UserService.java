package com.ht.springboot.service;

import com.ht.springboot.mapper.UserMapper;
import com.ht.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(String id){
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> userList(){
        return userMapper.selectAll();
    }

}
