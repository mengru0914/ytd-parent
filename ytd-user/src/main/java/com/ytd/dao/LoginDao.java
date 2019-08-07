package com.ytd.dao;

import com.ytd.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LoginDao extends JpaRepository<User,Integer> ,JpaSpecificationExecutor<User>{


    /**
     * 根据手机号查询用户
     * @param
     * @return
     */
    User findByMobile(String mobile);



}
