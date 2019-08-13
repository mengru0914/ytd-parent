package com.ytd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/UserMainTest")
public class UserTest {

    @RequestMapping("/Test")
    public String test(){
        return "openCount";
    }
}
