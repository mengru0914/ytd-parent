package com.ytd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
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
