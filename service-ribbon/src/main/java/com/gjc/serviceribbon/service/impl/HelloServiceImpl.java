package com.gjc.serviceribbon.service.impl;

import com.gjc.serviceribbon.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "hiError")  // 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
    @Override
    public String hiService(String name) {
        // 通过restTemplate消费service-hi 服务的/hi接口
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }


    public String hiError(String name) {
        return "hi," + name + ",sorry,error";
    }

}
