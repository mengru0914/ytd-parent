package com.ytd.dao;

import com.ytd.pojo.Trade;
import com.ytd.pojo.UserMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface TradeDao extends JpaRepository<Trade,Integer>,JpaSpecificationExecutor<Trade> {

    @Query(value ="select  * from Trade where serial_Number= ?1",nativeQuery = true)
    Trade selectTradeBySerialNumber(String serialNumber);
}
