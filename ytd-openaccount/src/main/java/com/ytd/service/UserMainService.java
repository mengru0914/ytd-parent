package com.ytd.service;

import com.ytd.dao.UserMainDao;
import com.ytd.pojo.UserMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


public interface UserMainService {


    Map<String,Object> proOpenAccount(Map<String,String> jxMap);

    UserMain selectUserMainByUserId(Integer userId);


}
