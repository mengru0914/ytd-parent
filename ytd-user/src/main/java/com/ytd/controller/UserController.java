package com.ytd.controller;


import com.ytd.pojo.User;
import com.ytd.service.UserService;
import com.ytd.util.MD5Utils;
import com.ytd.util.AliNoteSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/goUser")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册页面
     * @return
     */
    @RequestMapping("/toregister")
    public String toregister(){
        return "register";
    }

    /**
     * 注册功能
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public String register (User user){
        user.setPasswd(MD5Utils.MD5Encode(user.getPasswd(),"utf-8"));
        userService.save(user);
        return "login";
    }

    /**
     * 短信发送
     */
    @RequestMapping("/checkcode")
    @ResponseBody
    public String checkcode (@RequestParam(name="mobile") String mobile, HttpServletRequest request, HttpSession session){
        if(mobile==null || mobile.length()<=10){
            return "no";
        }
        //6位随机数生成
        String num=(int)((Math.random()*9+1)*100000)+"";

        request.getSession().setAttribute("num",num);
        System.out.println(num);

        //调用工具类
        AliNoteSend.sendNote(mobile,num);

        return "Ok";
    }



}
