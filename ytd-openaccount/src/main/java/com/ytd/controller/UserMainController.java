package com.ytd.controller;


import com.ytd.client.UserClient;
import com.ytd.pojo.UserMain;
import com.ytd.service.UserMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/goUserMain")
public class UserMainController {
    @Autowired
    private UserMainService usermainservice;

    @Autowired
    private UserClient userClient;

    @RequestMapping("/toMyAccount")
    public String login (Integer userid,Model model, HttpSession session){
        //UserMain userMainList = (UserMain) session.getAttribute("userMain");

        userClient.findByid(userid);

        UserMain useronemain = usermainservice.findByUserid(userid);
        model.addAttribute("useronemain",useronemain);
        return "myAccount";
    }
}
