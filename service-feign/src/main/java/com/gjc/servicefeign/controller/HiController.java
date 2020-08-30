package com.gjc.servicefeign.controller;

import com.gjc.servicefeign.fegin.TestServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private TestServiceHi testServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return testServiceHi.sayHiFromClientOne(name);
    }
}
