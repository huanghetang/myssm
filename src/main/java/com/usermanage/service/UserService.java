package com.usermanage.service;

import com.usermanage.mapper.UserMapper;
import com.usermanage.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryAll(){
        return userMapper.queryAll();
    }

}
