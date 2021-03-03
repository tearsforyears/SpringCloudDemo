package com.example.springcloudgate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringcloudgateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudgateApplication.class, args);
    }

}
