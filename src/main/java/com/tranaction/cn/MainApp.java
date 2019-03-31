package com.tranaction.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @auther SyntacticSugar
 * @data 2019/3/31 0031下午 10:32
 */


@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
        System.out.println("服务已经启动");
    }
}
