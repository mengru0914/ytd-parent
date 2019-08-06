package com.ytd.service;

import com.ytd.dao.UserJxMainDao;
import com.ytd.pojo.UserJxMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserJxMainService {
    @Autowired
    private UserJxMainDao userjxmainDao;

    public Optional<UserJxMain> findById(Integer id) {
        return userjxmainDao.findById(id);
    }
}
