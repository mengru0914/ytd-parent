package com.ytd.service;

import com.ytd.dao.UserMainDao;
import com.ytd.pojo.UserMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



public interface UserMainService {
    UserMain findByUserid(Integer userId);
}
