package com.ytd.controller;

import com.ytd.pojo.UserJxMain;
import com.ytd.service.UserJxMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/goUserJxMain")
public class UserJxMainController {
    @Autowired
    private UserJxMainService userjxmainservice;

    @RequestMapping("/toOpenAccount")
    public String toMyAccount(UserJxMain userJxMain, Model model){
        Optional<UserJxMain> userMainlist =userjxmainservice.findById(userJxMain.getId());
        model.addAttribute("userMainlist",userMainlist);
        return "openaccount";
    }


}
