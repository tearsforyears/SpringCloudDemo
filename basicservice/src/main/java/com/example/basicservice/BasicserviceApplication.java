package com.example.basicservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.example.basicservice.mapper")
public class BasicserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicserviceApplication.class, args);
    }

}
