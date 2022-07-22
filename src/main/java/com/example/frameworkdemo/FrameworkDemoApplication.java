package com.example.frameworkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.rainbowecho.web.servlet.security.EnableSecurity;

@SpringBootApplication
@EnableSecurity
public class FrameworkDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrameworkDemoApplication.class, args);
    }

}
