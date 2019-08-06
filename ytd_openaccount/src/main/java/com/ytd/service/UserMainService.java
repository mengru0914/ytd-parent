package com.ytd.service;

import com.ytd.dao.UserMainDao;
import com.ytd.pojo.UserMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserMainService {
    @Autowired
    private UserMainDao usermaindao;

    public Optional<UserMain> findByUserid(Integer userid) {
        if (userid!=null){
            return usermaindao.findById(userid);
        }
        return null;
    }
}
