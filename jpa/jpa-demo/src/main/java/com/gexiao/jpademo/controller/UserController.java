package com.gexiao.jpademo.controller;

import com.gexiao.jpademo.entity.User;
import com.gexiao.jpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gexiao
 *
 * @date 2019/1/17 14:35
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/{username}")
    public User getUser (@PathVariable("username") String username){
        return userService.findByName(username);
    }

    @GetMapping("/add")
    public User add() {
        return userService.add();
    }
}
