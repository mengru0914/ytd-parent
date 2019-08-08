package com.ytd.dao;

/**
 * 这里是注册功能模块UserDao
 * 开发人员：刘梦汝
 */

import com.ytd.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserDao extends JpaRepository<User,Integer> ,JpaSpecificationExecutor<User>{


}
