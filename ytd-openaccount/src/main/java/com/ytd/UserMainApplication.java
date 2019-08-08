package com.ytd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class UserMainApplication {
    /*
    *   mobile=18605210107
    *   passwd=123456
    *   randomCode=HABQYJ
    */
    public static void main(String[] args) {
        SpringApplication.run(UserMainApplication.class);
    }

}
