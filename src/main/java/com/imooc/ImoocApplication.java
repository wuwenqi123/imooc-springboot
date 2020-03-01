package com.imooc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.imooc.mapper")
@ComponentScan(basePackages= {"com.imooc", "org.n3r.idworker"})
//定时任务
@EnableScheduling
@EnableAsync
public class ImoocApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImoocApplication.class, args);
    }

}
