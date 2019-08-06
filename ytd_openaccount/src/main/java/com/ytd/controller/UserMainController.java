package com.ytd.controller;

import com.ytd.entity.Result;
import com.ytd.entity.StatusCode;
import com.ytd.pojo.UserMain;
import com.ytd.service.UserMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/goUserMain")
public class UserMainController {
    @Autowired
    private UserMainService usermainservice;

    @RequestMapping("/toMyAccount")
    public String login (UserMain userMain, Model model){
        Optional<UserMain> useronemain = usermainservice.findByUserid(userMain.getUserid());
        model.addAttribute("useronemain",useronemain);
        return "myAccount";
    }
}
