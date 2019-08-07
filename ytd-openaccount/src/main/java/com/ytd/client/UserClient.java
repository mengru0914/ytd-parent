package com.ytd.client;

import com.ytd.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@FeignClient("ytd-user")
public interface UserClient {

    @RequestMapping("/tofindByid")
    void findByid(Integer userid);
}
