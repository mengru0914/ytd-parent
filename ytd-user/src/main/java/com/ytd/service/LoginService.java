package com.ytd.service;

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
        User user = loginDao.findByMobile(mobile);
        if(user!=null&& encoder.matches(passwd,user.getPasswd())){
            return  user;
        }
        return null;
    }
}
