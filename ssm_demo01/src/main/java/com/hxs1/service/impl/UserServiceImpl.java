package com.hxs1.service.impl;

import com.hxs1.bean.User;
import com.hxs1.dao.UserDao;
import com.hxs1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User login(String username, String password) {
        return userDao.login(username, password);
    }
}
