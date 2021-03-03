package com.example.basicserviceinvoker.remoteInvoker;


import com.example.basicserviceinvoker.invokefailcallback.InfoCallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "spring-cloud-producer", fallback = InfoCallback.class)
public interface basicInvoker {
    @GetMapping("/ping")
    String ping();


    @GetMapping("/getNews")
    public String getNews();
}
