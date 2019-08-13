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

        //唯一流水号
        String uuid = UuidHelper.toPrettyString(UUID.nameUUIDFromBytes((date + time + seqNo).getBytes(Charset.forName("UTF-8"))));
        SysSwquenceJx sysSwquenceJx = sysSqueneceJxDao.selectByPrimaryKey(uuid);//查询唯一流水号
        if(sysSwquenceJx != null) {
            logger.error("生成江西流水号·流水号已存在",seqNo);
            date = new RandomUtils().todate();//日期
            time = new RandomUtils().totime();//时间
            seqNo = RandomNumberUtil.randomLong(6);;//流水号
            logger.info("生成江西流水号·重新生成流水号",seqNo);
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
