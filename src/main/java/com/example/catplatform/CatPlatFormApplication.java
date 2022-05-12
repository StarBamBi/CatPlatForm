package com.example.catplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.catplatform")
public class CatPlatFormApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatPlatFormApplication.class, args);
    }

}
