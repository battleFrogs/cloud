package com.gjc.servicefeign.fegin.impl;

import com.gjc.servicefeign.fegin.TestServiceHi;
import org.springframework.stereotype.Component;

@Component
public class TestServiceHiImpl implements TestServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
