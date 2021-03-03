package com.example.basicserviceinvoker.invokefailcallback;


import com.example.basicserviceinvoker.remoteInvoker.basicInvoker;
import org.springframework.stereotype.Component;

@Component
public class InfoCallback implements basicInvoker {
    @Override
    public String ping() {
        return "fail to ping";
    }

    @Override
    public String getNews() {
        return "fail to get news";
    }
}
