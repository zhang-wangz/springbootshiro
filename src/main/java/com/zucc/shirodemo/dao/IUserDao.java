package com.zucc.shirodemo.dao;

import com.zucc.shirodemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<User,Integer> {

    User findByUsername(String username);


}
