package com.zucc.shirodemo.service;

import com.zucc.shirodemo.entity.User;
import com.zucc.shirodemo.dao.IUserDao;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserDao userDao;

    public User getUserByUserName(String username) {
        return userDao.findByUsername(username);
    }

    @RequiresRoles("admin")
    public void send() {
        System.out.println("我现在拥有角色admin，可以执行本条语句");
    }

}