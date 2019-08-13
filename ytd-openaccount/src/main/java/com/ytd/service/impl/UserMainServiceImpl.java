package com.ytd.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ytd.dao.SysSqueneceJxDao;
import com.ytd.dao.TradeDao;
import com.ytd.dao.UserMainDao;
import com.ytd.jxsign.SignMapUtil;
import com.ytd.pojo.Trade;
import com.ytd.pojo.UserMain;
import com.ytd.service.JxOperationService;
import com.ytd.service.TradeService;
import com.ytd.service.UserMainService;
import com.ytd.util.*;
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
    @Autowired
    private TradeDao tradeService;

    //通用部分的接口
    @Autowired
    private JxOperationService jxOperationService;


    //根据userId查询数据
    @Override
    public UserMain selectUserMainByUserId(Integer userId) {

        return userMainDao.findByUserid(userId);

    }
    /**
     * 开通银行存管账户·校验参数.开户
     * @param jxMap
     * @return
     */
    @Override
    public Map<String, Object> proOpenAccount(Map<String, String> jxMap) {

        Map<String, Object> resultMap = new HashMap<String, Object>();//存放信息


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
        // List<UserMain> userMainList_IdNo = userMainDao.selectUserMainByIdCardNo(jxMap.get("idNo"));
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

        // 创建返回信息
        String acqRes = "realName=" + jxMap.get("realName");// 真实姓名
        acqRes += ",mobile=" + jxMap.get("mobile"); // 手机号
        acqRes += ",idNo=" + jxMap.get("idNo"); // 证件号码
        acqRes += ",userId=" + jxMap.get("userId"); // 用户标识

        //统一部分
        Map<String, String> reqMap =jxOperationService.getRequestMap();
        String serialNumber = null;
        serialNumber = TradeDef.GKH + reqMap.get("txDate") + reqMap.get("txTime") + reqMap.get("seqNo");
        reqMap.put("version","10");
        reqMap.put("txCode", "accountOpenEncryptPage");// 交易代码
        reqMap.put("idType", "01");// 证件类型
        reqMap.put("name", jxMap.get("realName"));// 姓名
        reqMap.put("gender", IdCardUtil.getGenderByIdCard(jxMap.get("idNo")));// 性别
        reqMap.put("mobile", jxMap.get("mobile"));// 手机号
       // reqMap.put("smsFlag", "1");// 是否需要开通动账短信通知 0：不需要 1或空：需要

        reqMap.put("idNo",(String)jxMap.get("idNo"));//
        reqMap.put("acctUse","1");//账户用途
        reqMap.put("cardNo","6951256232145615957");//绑定卡
        reqMap.put("email", "1241013462@qq.com");//邮箱
        // reqMap.put("coinstName", pppigCompanyName);// 商户名称
        reqMap.put("retUrl", "http://10.1.67.14:9002/UserMainTest/Test" + "OpenAccount?orderId=" + serialNumber);// 前台跳转链接
        reqMap.put("notifyUrl", "http://10.1.67.14:9002/goUserMain/getResponseOpenAccount" + "OpenAccount");// 后台通知链接
        reqMap.put("userIP","10.1.67.14");
        reqMap.put("acqRes", acqRes);

      /*  //创建签名
        String sign = jxOperationService.creatSign(reqMap);
        reqMap.put("sign", sign);// 签名
        logger.info("用户，江西银行开户 （合规）·请求信息",jxMap.get("userId"),JSON.toJSON(reqMap));*/

        // 添加到trade记录表
        Trade insertTrade = new Trade();
        insertTrade.setMessageId(reqMap.get("txCode"));
        insertTrade.setUserId(userMain.getUserId());// 发送请求的id
        insertTrade.setSerialNumber(serialNumber);
        insertTrade.setRequestMessage(reqMap.get("sign"));
        insertTrade.setTradeStatus("WAITING");
        insertTrade.setTradeDate(new Date());
        insertTrade.setQd(jxMap.get("channel"));
        insertTrade.setVersion(Integer.valueOf(reqMap.get("version")));
       // tradeService.save(insertTrade);


        resultMap.put("serialNumber", serialNumber);
        resultMap.put("reqMap", reqMap);

        return resultMap;


    }



    /**
     * 江西银行开户加密·后台回调
     * @description
     * @author lmr
     *
     */
    public void getAsynFinishOpenAccount(Map<String, String> responseMap) {	// 银行开户加密·后台回调
        String serialNumber =  responseMap.get("txDate")+responseMap.get("txTime")+responseMap.get("seqNo");
        Trade trade = tradeService.selectTradeBySerialNumber(serialNumber);
        if(trade == null) {
            logger.error("江西银行开户加密·后台回调流水记录=[{}] 不存在。",serialNumber);
            return ;
        } else if (trade.getTradeStatus().equals(Constant.TradeStatusSu)) {
            logger.error("用户,江西银行开户加密·后台回调已处理完毕......................", trade.getUserId());
            return;
        }
        logger.info("用户,江西银行开户 （合规）·后台回调信息",trade.getUserId(),JSON.toJSON(responseMap));

        // 处理请求方保留
        JSONObject responseJSON = new JSONObject();
        String[] acqResArray = responseMap.get("acqRes").split(",");
        for (String acqRes : acqResArray) {
            responseJSON.put(acqRes.split("=")[0], acqRes.split("=")[1]);
        }

        UserMain userMain = userMainService.selectUserMainByUserId(trade.getUserId());
        /*if (("00000000").equals(responseMap.get("retCode"))) {
            boolean checkSign = jxOperationService.checkSign(responseMap);
            if(!checkSign) {
                logger.error("用户·江西银行开户（合规）失败，验签失败",trade.getUserId());
                return ;
            }
        }else {
            logger.error("用户·江西银行开户（合规）失败。订单号·错误码=响应描述",userMain.getUserId(),serialNumber,responseMap.get("retCode"),responseMap.get("retMsg"));
            // 修改trade记录
            trade.setTradeStatus(responseMap.get("retCode"));
            trade.setResponseMessage(responseMap.get("sign"));
            tradeService.toUpdateTrade(trade);
            return ;
        }*/

        /*// 修改trade记录
        trade.setTradeStatus(Constant.TradeStatusSu);// 状态
        trade.setResponseMessage(responseMap.get("sign"));// 响应签名
        tradeService.toUpdateTrade(trade);

        // 修改userMain
        UserMain updateUserMain = new UserMain();
        updateUserMain.setUserId(userMain.getUserId()); // 用户Id
        updateUserMain.setIdCardNo(responseJSON.get("idNo").toString()); // 身份证号
        updateUserMain.setUserCode(responseMap.get("accountId")); // 电子账号
        updateUserMain.setRealName(responseJSON.get("realName").toString()); // 真实姓名
        updateUserMain.setJxmobile(responseJSON.get("mobile").toString()); // 第三方预留手机号
        updateUserMain.setAccountOpenTime(new Date()); // 开户时间
        if(("1").equals(responseMap.get("status"))) {
            updateUserMain.setIsPwdSet(1);
        }
        userMainService.toUpdateUserMain(updateUserMain);*/




        logger.info("用户·开通第三方电子账户电子账号", userMain.getUserId(), responseMap.get("accountId"));
    }







}
