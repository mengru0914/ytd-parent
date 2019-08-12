package com.ytd.dao;

import com.ytd.pojo.SysSwquenceJx;
import com.ytd.pojo.UserMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


//@Mapper
public interface UserMainDao extends JpaRepository<UserMain,Integer>,JpaSpecificationExecutor<UserMain>{

//    @Select("Select * from user_main WHERE userId = #{userId}")
    @Query(value = "Select * from user_main WHERE userId = ?1",nativeQuery = true)
    UserMain findByUserid(Integer userId);

    List<UserMain> selectUserMainByJxMobile(String mobile);//查询手机号是否开过户

    List<UserMain> selectUserMainByIdCardNo(String idNo);//查询身份证是否开过户


}
