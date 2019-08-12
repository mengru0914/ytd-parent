package com.ytd.client;

import com.ytd.pojo.UserMain;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@FeignClient("ytd-user")
public interface UserClient {

    @RequestMapping("/tofindByid")
    UserMain login (UserMain user, HttpSession session, HttpServletRequest request, String  randomCode, String passwd);
}