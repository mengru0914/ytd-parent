package com.ytd.controller;


import com.ytd.client.UserClient;
import com.ytd.pojo.UserMain;
import com.ytd.service.UserMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@CrossOrigin
@RequestMapping("/goUserMain")
public class UserMainController {
    @Autowired
    private UserMainService usermainservice;

    @Autowired
    private UserClient userClient;

    @RequestMapping("/toMyAccount")
    public String login (Integer userId, HttpServletRequest request, HttpSession session){
        UserMain useronemain = usermainservice.findByUserid(userId);
        request.setAttribute("useronemain",useronemain);
        return "myAccount";
    }
}
