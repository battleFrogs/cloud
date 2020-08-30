package com.gjc.servicefeign.fegin;

import com.gjc.servicefeign.fegin.impl.TestServiceHiImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


// feignClient("服务名")
@FeignClient(value = "service-hi" ,fallback = TestServiceHiImpl.class)
public interface TestServiceHi {


    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);



}
