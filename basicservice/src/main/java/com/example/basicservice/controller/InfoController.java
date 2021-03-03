package com.example.basicservice.controller;


import com.example.basicservice.mapper.NewsMapper;
import com.example.basicservice.repository.News;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class InfoController {
    @Autowired
    NewsMapper newsMapper;

    @GetMapping("/getNews")
    public List<News> getNews() {
        return newsMapper.getNews();
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
