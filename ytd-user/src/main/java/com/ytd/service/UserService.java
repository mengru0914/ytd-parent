package com.ytd.service;

/**
 * 这里是注册功能模块UserService
 * 开发人员：刘梦汝
 */

import com.ytd.dao.UserDao;
import com.ytd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
/**
 * 这里是注册功能模块UserService
 * 开发人员：刘梦汝
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private BCryptPasswordEncoder encoder;

    public void save(User user) {
        //存储一些基本数据进入个人信息
        user.setPasswd(encoder.encode(user.getPasswd()));//密码加密
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
        //注册信息入user_main
        userDao.save(user);
    }


}
