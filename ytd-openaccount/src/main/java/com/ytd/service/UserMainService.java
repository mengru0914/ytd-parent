package com.ytd.service;

import com.ytd.dao.UserMainDao;
import com.ytd.pojo.UserMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserMainService {
    @Autowired
    private UserMainDao usermaindao;

    public UserMain findByUserid(Integer userid) {
       return usermaindao.findByUserid(userid);
    }
}
