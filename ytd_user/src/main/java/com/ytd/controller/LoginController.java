package com.ytd.controller;

import com.ytd.pojo.User;
import com.ytd.service.LoginService;
import com.ytd.util.AuthImageServlet;
import com.ytd.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/goLogin")
public class LoginController {

    @Autowired
    private LoginService loginservice;

    /**
     * 注册页面
     * @return
     */
    @RequestMapping("/tologin")
    public String toregister(){
        return "login";
    }

    @RequestMapping("/login")
    public String login (User user){
        user.setPasswd(MD5Utils.MD5Encode(user.getPasswd(),"utf-8"));
        User u =  loginservice.login(user.getMobile());
        return "list";
    }

    @RequestMapping("/AuthImageServlet")
    public void AuthImageServlet (HttpServletRequest request, HttpServletResponse response){
        new AuthImageServlet().createImage(request,response);
    }



}
