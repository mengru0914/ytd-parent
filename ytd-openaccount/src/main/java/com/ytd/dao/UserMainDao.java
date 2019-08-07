package com.ytd.dao;

import com.ytd.pojo.UserMain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

@Mapper
public interface UserMainDao extends JpaRepository<UserMain,Integer> ,JpaSpecificationExecutor<UserMain>{

    @Select("Select * from user_main WHERE userid = #{userid}")
    UserMain findByUserid(Integer userid);
}
