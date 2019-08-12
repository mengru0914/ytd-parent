package com.ytd.service.impl;

import com.ytd.dao.SysSqueneceJxDao;
import com.ytd.dao.UserMainDao;
import com.ytd.jxsign.SignMapUtil;
import com.ytd.pojo.Trade;
import com.ytd.pojo.UserMain;
import com.ytd.service.JxOperationService;
import com.ytd.service.UserMainService;
import com.ytd.util.IdCardUtil;
import com.ytd.util.SignUtil_lj;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@Transactional
public class UserMainServiceImpl implements UserMainService {

    private static final Logger logger = LoggerFactory.getLogger(UserMainServiceImpl.class);

//  @Autowired(required=true)
    @Autowired
    private UserMainService userMainService;
    @Autowired
    private UserMainDao userMainDao;

    //通用部分的接口
    @Autowired
    private JxOperationService jxOperationService;


    //根据userId查询数据
    public UserMain selectUserMainByUserId(Integer userId) {

        return userMainService.selectUserMainByUserId(userId);
    }

    /**
     * 开通银行存管账户·校验参数
     * @param jxMap
     * @return
     */
    @Override
    public Map<String, Object> proOpenAccount(Map<String, String> jxMap) {

        Map<String, Object> resultMap = new HashMap<String, Object>();

        // 验证用户是否注册
        UserMain userMain = userMainService.selectUserMainByUserId(Integer.valueOf(jxMap.get("userId")));
        if (userMain == null) {
            logger.error("用户·江西银行开户 （合规），用户信息不存在",jxMap.get("userId"), jxMap.get("mobile"));

            resultMap.put("error","未注册");
            return resultMap;
        }

        // 验证用户是否开过户
        if (!StringUtils.isBlank(userMain.getUserCode())) {
            logger.error("用户·江西银行开户 （合规），已开通银行存管账户", jxMap.get("userId"), userMain.getUserCode());
            resultMap.put("error","已开户");
            return resultMap;
        }

        //验证开户手机号是否申领过电子账户
        List<UserMain> userMainList_Mobile = userMainDao.selectUserMainByJxMobile(jxMap.get("mobile"));
        if(!userMainList_Mobile.isEmpty()) {
            logger.error("用户·江西银行开户 （合规），当前手机号已申领过电子账号。",jxMap.get("userId"),jxMap.get("mobile"));
            resultMap.put("error","手机号已开过户");
            return resultMap;
        }

        //验证身份证信息是否申领过电子账户
        List<UserMain> userMainList_IdNo = userMainDao.selectUserMainByIdCardNo(jxMap.get("idNo"));
        if(!userMainList_IdNo.isEmpty()) {
            logger.error("用户·江西银行开户 （合规），当前身份证号已申领过电子账号。",jxMap.get("userId"),jxMap.get("idNo"));
            resultMap.put("error","身份证已开过户");
            return resultMap;
        }

        //正则验证身份证号
        String regex = "^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(jxMap.get("idNo"));
        if(!matcher.matches()) {
            logger.error("用户=·江西银行开户 （合规），当前身份证号= 正则验证未通过。",jxMap.get("userId"),jxMap.get("idNo"));
            resultMap.put("error","身份证不合格");
            return resultMap;
        }
        return resultMap;


    }











}
