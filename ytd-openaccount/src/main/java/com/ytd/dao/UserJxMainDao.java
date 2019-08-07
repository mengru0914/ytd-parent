package com.ytd.dao;

import com.ytd.pojo.UserJxMain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

@Mapper
public interface UserJxMainDao extends JpaRepository<UserJxMain,Integer>,JpaSpecificationExecutor<UserJxMain> {

    @Select("Select * from user_jx_main WHERE userid = #{userid},id = #{id}")
    UserJxMain findByUserid(UserJxMain userJxMain);
}
