package com.ytd.controller;


import com.ytd.client.UserClient;
import com.ytd.pojo.UserMain;
import com.ytd.service.UserMainService;
import com.ytd.service.impl.ResultHandle;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;


@Controller
@CrossOrigin
@RequestMapping("/goUserMain")
public class UserMainController {
    private static final Logger logger = LoggerFactory.getLogger(UserMainController.class);
    @Autowired
    private UserMainService usermainService;

   /* @Autowired
    private UserClient userClient;*/


    /**
     * 跳转到我的账户的页面
     * @param userId
     * @param request
     * @param session
     * @return
     */
    @RequestMapping("/MyAccount")
    public String toCheckOpenAccount ( String userId,HttpServletRequest request){

        request.setAttribute("userId",userId);

        return "myAccount";
    }

    /**
     * 信息校验
     * @param userId
     * @param request
     * @param session
     * @return
     */
    @RequestMapping("/toMyAccount")
    @ResponseBody
    public String toOpenAccount (Integer userId, HttpServletRequest request, HttpSession session){
        ModelAndView modelAndView = new ModelAndView();

        //验证用户是否注册
        UserMain userMain = usermainService.findByUserid(userId);//通过登录用户的userId查询一组对象

        request.setAttribute("useronemain",userMain);
        // 验证用户是否注册
        if (userMain == null) {
            logger.error("用户=[{}]·银行开户 （合规），用户信息不存在，手机号=[{}]",userMain.getUserId(), userMain.getMobile());
           // modelAndView.setViewName("register");
            return "redirect:goUser/toregister";
        }

        // 验证用户是否开过户
        if (userMain.getUserCode()!=null) {
            logger.error("用户=[{}]·银行开户 （合规），已开通银行存管账户=[{}]", userMain.getUserId(), userMain.getUserCode());
            return "";//跳转到已经开过户的页面
        }

        modelAndView.setViewName("openCount");

        return "ok";
    }



}
