package com.ytd.service;

import com.ytd.dao.LoginDao;
import com.ytd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;

    public User login(String mobile) {
        return loginDao.findByMobile(mobile);
    }

}
