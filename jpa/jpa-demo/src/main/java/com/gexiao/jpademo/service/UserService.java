package com.gexiao.jpademo.service;

import com.gexiao.jpademo.dao.UserDao;
import com.gexiao.jpademo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gexiao
 * @date 2019/1/17 11:53
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findByName(String username) {
        return userDao.findByUsername(username);
    }

    public User add() {
        User u1 = new User();
        u1.setUsername("username");
        u1.setPassword("password");

        User save = userDao.save(u1);
        return save;
    }
}
