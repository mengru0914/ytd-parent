package com.ytd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goOpen")
public class OpenController {

    @RequestMapping("/toopen")
    public String toopen(){
        return "openaccount";
    }
}
