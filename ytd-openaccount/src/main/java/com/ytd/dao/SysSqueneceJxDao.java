package com.ytd.dao;


import com.ytd.pojo.SysSwquenceJx;
import com.ytd.pojo.UserMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.Mapping;



public interface SysSqueneceJxDao extends JpaRepository<SysSwquenceJx,Integer>,JpaSpecificationExecutor<SysSwquenceJx> {

    @Query(value = "Select * from sys_sequence_jx WHERE uuid = ?1",nativeQuery = true)
    SysSwquenceJx selectByPrimaryKey(String uuid);

}
