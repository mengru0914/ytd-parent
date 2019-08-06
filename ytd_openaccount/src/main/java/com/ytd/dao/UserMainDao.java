package com.ytd.dao;

import com.ytd.pojo.UserMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserMainDao extends JpaRepository<UserMain,Integer> ,JpaSpecificationExecutor<UserMain>{

}
