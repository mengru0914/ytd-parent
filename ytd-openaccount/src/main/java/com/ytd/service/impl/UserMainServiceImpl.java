package com.ytd.service.impl;

import com.ytd.dao.UserMainDao;
import com.ytd.pojo.UserMain;
import com.ytd.service.UserMainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserMainServiceImpl implements UserMainService {

    private static final Logger logger = LoggerFactory.getLogger(UserMainServiceImpl.class);

//  @Autowired(required=true)
    @Autowired
    private UserMainDao userMainDao;

    public UserMain findByUserid(Integer userId) {


        return userMainDao.findByUserid(userId);
    }


}
