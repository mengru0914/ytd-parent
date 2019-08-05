package com.ytd.dao;

import com.ytd.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface UserDao extends JpaRepository<User,Integer> ,JpaSpecificationExecutor<User>{


    /*@Modifying
    @Query(value = "update user_main set mobile=#{mobile},passwd=#{passwd} where userId=#{userId}" )
    void register(User user);*/
}
