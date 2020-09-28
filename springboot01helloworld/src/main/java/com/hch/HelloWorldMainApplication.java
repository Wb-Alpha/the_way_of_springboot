package com.hch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    @SpringBootApplication来标注一个主程序类，说明这是一个SpringBoot类
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        // Spring应用启动
        SpringApplication.run(HelloWorldMainApplication.class, args);

    }
}
