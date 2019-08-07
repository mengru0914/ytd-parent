package com.ytd.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@FeignClient("ytd-openaccount")
public interface UsermainClient {

    @RequestMapping("/toMyAccount")
    public String login(Integer userid, Model model, HttpSession session);
}
