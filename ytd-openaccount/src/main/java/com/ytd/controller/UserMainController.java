package com.ytd.controller;


import com.alibaba.fastjson.JSON;
import com.ytd.client.UserClient;
import com.ytd.pojo.UserMain;
import com.ytd.service.JxOperationService;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Controller
@CrossOrigin
@RequestMapping("/goUserMain")
public class UserMainController {

    private static final Logger logger = LoggerFactory.getLogger(UserMainController.class);
    @Autowired
    private UserMainService userMainService;
    @Autowired
    private JxOperationService jxOperationService;

   /* @Autowired
    private UserClient userClient;*/


    /**
     * 跳转到我的账户页面
     * @param userId
     * @param request
     * @return
     */
    @RequestMapping("/MyAccount")
    public String toOpenCount ( String userId,HttpServletRequest request){

        request.setAttribute("userId",userId);

        return "myAccount";
    }

    /**
     * 开户信息页面
     * @param userId
     * @param request
     * @return
     */
    @RequestMapping("/toOpenCount")
    public String toOpenCountS ( String userId,HttpServletRequest request){

        request.setAttribute("userId",userId);

        return "openCount";
    }
    /**
     * 注册页面
     * @return
     */
    @RequestMapping("/toregister")
    public String toregister(){
        return "register";
    }

    /**
     * 信息校验是否注册，是否开户
     * @param userId
     * @param request
     * @param session
     * @return
     */
    @RequestMapping("/toMyAccount")
    @ResponseBody
    public int toOpenAccount (Integer userId, HttpServletRequest request, HttpSession session){
        session.setAttribute("userId",userId);
        //验证用户是否注册
        UserMain userMain = userMainService.selectUserMainByUserId(userId);//通过登录用户的userId查询一组对象

        request.setAttribute("useronemain",userMain);
        // 验证用户是否注册
        if (userMain == null) {
            logger.error("用户="+userMain.getUserId()+"·银行开户 （合规），用户信息不存在，手机号="+userMain.getMobile()+"",userMain.getUserId(), userMain.getMobile());
           // modelAndView.setViewName("register");
           return 2;
        }

        // 验证用户是否开过户
        if (userMain.getUserCode()!=null) {
            logger.error("用户="+userMain.getUserId()+"·银行开户 （合规），已开通银行存管账户", userMain.getUserId(), userMain.getUserCode());
            return 0;//跳转到已经开过户的页面
        }

        return 1;
    }

    /**
     * 校验真实姓名、手机号、银行卡
     * @param request
     * @param session
     */
    public String checkOpenAccount ( HttpServletRequest request, HttpSession session,String realName,String idCardNo,String mobile){

        int userId = (int) session.getAttribute("userId");
        //验证用户是否注册
        UserMain userMain = userMainService.selectUserMainByUserId(userId);//通过登录用户的userId查询一组对象

        Map<String,String> jxMap = new HashMap<>();
        jxMap.put("userId", userMain.getUserId().toString());
        jxMap.put("realName", realName);
        jxMap.put("idNo", idCardNo);
        jxMap.put("mobile", mobile);
        Map<String,Object> resultMap = userMainService.proOpenAccount(jxMap);

        return "/openCount";


    }

    /**
     * 开通银行存管账户
     *
     */
    @RequestMapping("/getOpenAccount")
    public String getOpenAccount(HttpServletRequest request,HttpSession session) {
        Map<String,String> jxMap = new HashMap<String,String>();

        jxMap.put("userId", (String) session.getAttribute("userId"));
        jxMap.put("realName", request.getParameter("realName"));
        jxMap.put("idNo", request.getParameter("idNo"));
        jxMap.put("mobile", request.getParameter("mobile"));

        Map<String,Object> resultMap = jxOperationService.getOpenAccount(jxMap);
        request.setAttribute("resultMap", resultMap);
        if(resultMap.get("retMsg") != null) {
            return "view/jxpay/error";
        }
        return "view/jxpay/start-OpenAccount";
    }



}
