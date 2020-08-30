package com.gjc.eurekaclienthi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientHiApplication.class, args);
    }

}
