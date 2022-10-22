package com.adem;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("deneme,com.adem.repository")
public class Core {
    public static void main(String[] args) {
        SpringApplication.run(Core.class,args);
    }
}
