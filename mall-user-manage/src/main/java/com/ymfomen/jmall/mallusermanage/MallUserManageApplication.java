package com.ymfomen.jmall.mallusermanage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.ymfomen.jmall.mallusermanage.mapper")
@ComponentScan("com.ymfomen.jmall") //后续会使用redis
public class MallUserManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallUserManageApplication.class, args);
    }

}
