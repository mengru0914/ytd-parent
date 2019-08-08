package com.ytd.service;

/**
 * 这里是登录功能模块LoginService
 * 开发人员：刘梦汝
 */

import com.ytd.dao.LoginDao;
import com.ytd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.beans.Encoder;

@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    @Autowired
    BCryptPasswordEncoder encoder;


    /***
     * 根据手机号和密码查询用户
     *  @param mobile
     *  @param passwd
     * @return
     * */
    public User findByMobileAndPassWord(String mobile, String passwd) {
        //去Dao 查询数据JPA
        User user = loginDao.findByMobile(mobile);
        if(user!=null&& encoder.matches(passwd,user.getPasswd())){//判断密码
            return  user;
        }
        return user;
    }
}
