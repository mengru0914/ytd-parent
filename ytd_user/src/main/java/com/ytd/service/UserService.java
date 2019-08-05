package com.ytd.service;

import com.ytd.dao.UserDao;
import com.ytd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void save(User user) {
        userDao.save(user);
    }

    public void save() {}
}
