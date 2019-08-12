package com.ytd.service.impl;

import com.alibaba.fastjson.JSON;
import com.ytd.controller.UserMainController;
import com.ytd.dao.SysSqueneceJxDao;
import com.ytd.dao.TradeDao;
import com.ytd.dao.UserMainDao;
import com.ytd.jxsign.SignMapUtil;
import com.ytd.pojo.SysSwquenceJx;
import com.ytd.pojo.Trade;
import com.ytd.pojo.UserMain;
import com.ytd.service.JxOperationService;
import com.ytd.service.TradeService;
import com.ytd.service.UserMainService;
import com.ytd.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.util.*;

@Service
public class jXOperationServiceImpl implements JxOperationService {

    @Autowired
    private SysSqueneceJxDao sysSqueneceJxDao;

    @Autowired
    private UserMainService userMainService;
    @Autowired
    private TradeDao tradeDao;

    private static final Logger logger = LoggerFactory.getLogger(UserMainController.class);

    /**
     * 通用部分统一管理
     * @description 1.version : 版本号   2.instCode : 机构代码  3.bankCode : 银行代码  4.channel : 交易渠道  5.txDate : 交易日期  6.txTime : 交易时间  7.seqNo : 交易流水号
     * @author wfl
     * @date 2018年1月11日 下午5:03:07
     */
    @Override
    public Map<String, String> getRequestMap() {
        String date = new RandomUtils().todate();//日期
        String time = new RandomUtils().totime();//时间
        Long seqNo = RandomNumberUtil.randomLong(6);//流水号

        String uuid = UuidHelper.toPrettyString(UUID.nameUUIDFromBytes((date + time + seqNo).getBytes(Charset.forName("UTF-8"))));
        SysSwquenceJx sysSwquenceJx = sysSqueneceJxDao.selectByPrimaryKey(uuid);//查询唯一流水号
        if(sysSwquenceJx != null) {
            logger.error("生成江西流水号·流水号=[{}]已存在",seqNo);
            date = new RandomUtils().todate();//日期
            time = new RandomUtils().totime();//时间
            seqNo = RandomNumberUtil.randomLong(6);;//流水号
            logger.info("生成江西流水号·重新生成流水号=[{}]",seqNo);
        }
        sysSwquenceJx = new SysSwquenceJx();
        sysSwquenceJx.setUuid(uuid);
        sysSwquenceJx.setTxDate(date);
        sysSwquenceJx.setTxTime(time);
        sysSwquenceJx.setSeqNo(Integer.valueOf(seqNo.toString()));
        sysSwquenceJx.setInsertTime(new Date());
        sysSqueneceJxDao.save(sysSwquenceJx);


        Map<String, String> reqMap = new TreeMap<String, String>();
        reqMap.put("version", Constant.version);
        reqMap.put("instCode", Constant.instCode);
        reqMap.put("bankCode", Constant.bankCode);
        reqMap.put("channel", Constant.channel);
        reqMap.put("txDate", date);
        reqMap.put("txTime", time);
        reqMap.put("seqNo", seqNo.toString());
        return reqMap;
    }

    @Override
    public Map<String, Object> getOpenAccount(Map<String, String> jxMap) {
        Map<String, Object> proOpenAccount = userMainService.proOpenAccount(jxMap);

        if(!proOpenAccount.get("retCode").toString().equals("0")) {
            logger.error("用户=[{}]·开户，二次校验失败=[{}]", jxMap.get("userId"), JSON.toJSONString(proOpenAccount));
            return proOpenAccount;
        }

        // 用户信息
        UserMain userMain = userMainService.selectUserMainByUserId(Integer.valueOf(jxMap.get("userId")));

        // 创建返回信息
        String acqRes = "realName=" + jxMap.get("realName");// 真实姓名
        acqRes += ",mobile=" + jxMap.get("mobile"); // 手机号
        acqRes += ",idNo=" + jxMap.get("idNo"); // 证件号码
        acqRes += ",userId=" + jxMap.get("userId"); // 用户标识

        Map<String, String> reqMap = getRequestMap();
        String serialNumber = null;
        reqMap.put("txCode", "accountOpenEncryptPage");// 交易代码
        reqMap.put("idType", "01");// 证件类型
        reqMap.put("name", jxMap.get("realName"));// 姓名
        reqMap.put("gender", IdCardUtil.getGenderByIdCard(jxMap.get("idNo")));// 性别
        reqMap.put("mobile", jxMap.get("mobile"));// 手机号
        reqMap.put("smsFlag", "1");// 是否需要开通动账短信通知 0：不需要 1或空：需要

       // reqMap.put("coinstName", pppigCompanyName);// 商户名称
        reqMap.put("retUrl", "127.0.0.1/9002/goUserMain/toMyAccount" + "OpenAccount?orderId=" + serialNumber);// 前台跳转链接
        reqMap.put("notifyUrl", "goUserMain/getOpenAccount" + "OpenAccount");// 后台通知链接
        reqMap.put("acqRes", acqRes);

        String sign = creatSign(reqMap);
        reqMap.put("sign", sign);// 签名
        logger.info("用户=[{}]，江西银行开户 （合规）·请求信息=[{}]",jxMap.get("userId"),JSON.toJSON(reqMap));

        // 添加到trade记录表
        Trade insertTrade = new Trade();
        insertTrade.setMessageId(reqMap.get("txCode"));
        insertTrade.setUserId(userMain.getUserId());// 发送请求的id
        insertTrade.setSerialNumber(serialNumber);
        insertTrade.setRequestMessage(reqMap.get("sign"));
        insertTrade.setTradeStatus("WAITING");
        insertTrade.setTradeDate(new Date());
        insertTrade.setQd(jxMap.get("channel"));
        tradeDao.save(insertTrade);

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("openAccountUrl", "");
        resultMap.put("serialNumber", serialNumber);
        resultMap.put("reqMap", reqMap);
        return resultMap;
    }


    /**
     * 创建签名
     * @description
     */
    @SuppressWarnings({ "rawtypes" })
    public String creatSign(Map<String, String> reqMap) {
        // 生成待签名字符串
        String requestMapMerged = SignMapUtil.mergeMap(new TreeMap(reqMap));
        // 生成签名
        String sign = SignUtil_lj.sign(requestMapMerged);
        return sign;
    }




}
