package com.tranaction.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.PostConstruct;

/**
 * @auther SyntacticSugar
 * @data 2019/3/31 0031下午 10:32
 */

@MapperScan(basePackages = "com.tranaction.cn.mapper",annotationClass = Repository.class)
@SpringBootApplication(scanBasePackages = {"com.tranaction.cn"})
public class MainApp {
    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
        System.out.println("服务已经启动");
    }
    @Autowired
    PlatformTransactionManager platformTransactionManager=null;
    @PostConstruct
    public void showTransaction(){
        System.out.println(platformTransactionManager.getClass().getName());
    }

}
