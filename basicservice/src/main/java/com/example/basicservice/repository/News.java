package com.example.basicservice.repository;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
@Data
public class News {
    Integer id;
    String title;
    String content;
    Date time;
    String author;
}
