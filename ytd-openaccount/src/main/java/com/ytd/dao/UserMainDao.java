package com.ytd.dao;

import com.ytd.pojo.User;
import com.ytd.pojo.UserMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;


//@Mapper
public interface UserMainDao extends JpaRepository<UserMain,Integer>,JpaSpecificationExecutor<UserMain>{

//    @Select("Select * from user_main WHERE userId = #{userId}")
    @Query(value = "Select * from user_main WHERE userId = ?1",nativeQuery = true)
    UserMain findByUserid(Integer userId);

}
