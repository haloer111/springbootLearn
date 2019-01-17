package com.gexiao.jpademo.dao;

import com.gexiao.jpademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author gexiao
 * @date 2019/1/17 11:51
 */
public interface UserDao extends JpaRepository<User,String> {

    User findByUsername(String username);
}
