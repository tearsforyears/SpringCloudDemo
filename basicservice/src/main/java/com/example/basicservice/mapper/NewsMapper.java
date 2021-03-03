package com.example.basicservice.mapper;

import com.example.basicservice.repository.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface NewsMapper {
    @Select("select * from news")
    List<News> getNews();
}
