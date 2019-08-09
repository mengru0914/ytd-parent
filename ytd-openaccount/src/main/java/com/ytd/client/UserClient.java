package com.ytd.client;

import com.ytd.pojo.User;
import com.ytd.pojo.UserMain;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@FeignClient("ytd-user")
public interface UserClient {

    @RequestMapping("/tofindByid")
    UserMain login (User user, HttpSession session, HttpServletRequest request, String  randomCode, String passwd);
}