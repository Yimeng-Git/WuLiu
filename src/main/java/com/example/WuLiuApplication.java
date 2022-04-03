package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class WuLiuApplication {

    public static void main(String[] args) {
        SpringApplication.run(WuLiuApplication.class, args);
    }

}
