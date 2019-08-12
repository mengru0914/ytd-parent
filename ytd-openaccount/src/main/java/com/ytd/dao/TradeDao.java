package com.ytd.dao;

import com.ytd.pojo.Trade;
import com.ytd.pojo.UserMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TradeDao extends JpaRepository<Trade,Integer>,JpaSpecificationExecutor<Trade> {

}
