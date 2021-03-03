package com.example.basicserviceinvoker.controller;


import com.example.basicserviceinvoker.remoteInvoker.basicInvoker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Autowired
    basicInvoker basicInvoker;

    @GetMapping
    public String invoke() {
        return "ping to basic server " + basicInvoker.ping();
    }

    @GetMapping("/info")
    public String getInfo() {
        return basicInvoker.getNews();
    }
}
