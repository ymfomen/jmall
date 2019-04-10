package com.ymfomen.jmall.mallorderweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ymfomen.jmall") //后续会使用redis
public class MallOrderWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallOrderWebApplication.class, args);
    }

}
