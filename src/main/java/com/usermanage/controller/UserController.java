package com.usermanage.controller;

import com.usermanage.pojo.User;
import com.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("query")
    public ResponseEntity<List<User>> queryALl(){

        List<User> users = userService.queryAll();
        if (users!=null){
            return ResponseEntity.ok(users);
        }
        return ResponseEntity.notFound().build();
    }
}
