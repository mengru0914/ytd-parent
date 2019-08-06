package com.ytd.dao;

import com.ytd.pojo.UserJxMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserJxMainDao extends JpaRepository<UserJxMain,Integer> ,JpaSpecificationExecutor<UserJxMain>{





}
