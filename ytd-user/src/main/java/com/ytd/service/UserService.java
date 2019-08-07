package com.ytd.service;

import com.ytd.dao.UserDao;
import com.ytd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void save(User user) {
        user.setRegisterTime(new Date());
        user.setPayPassword("000000");
        user.setNickName(user.getMobile());
        user.setRoles(2);
        user.setCash(0.00);
        user.setFrozenWithDrawCash(0.00);
        user.setFrozenBiddingCash(0.00);
        user.setIdVerifyLimit(1);
        user.setStatus(0);
        user.setForbidStatus(0);
        user.setAlbumCapacity(0);
        user.setSecurityLevel(0);
        if(user.getReferee()==null || "".equals(user.getReferee())){
            user.setReferee("");
        }
        userDao.save(user);
    }


}
