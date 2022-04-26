package com.xiaodi.qa.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author xiaodi.gou
 * @create 2021/11/15 4:13 下午
 */
@Slf4j
@Component
@EnableScheduling
public class Schedule {
    @Scheduled(cron = "0/100 * * * * ? ")
    public void myPrint(){
        System.out.println("gouxiaodi-我是schedule");
        System.out.println(System.currentTimeMillis());

        log.info("now is:" + new Date());
        //log.info("now is:" + new Date(1636967340002l));

    }

}
