package com.ytd.dao;

import com.ytd.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

@Mapper
public interface LoginDao extends JpaRepository<User,Integer> ,JpaSpecificationExecutor<User>{


    /**
     * 根据手机号查询用户
     * @param
     * @return
     */
    @Select("Select * from user_main WHERE mobile = #{mobile}")
    User findByMobile(String mobile);



}
