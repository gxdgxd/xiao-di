package com.xiaodi.qa.bootquartz;

import lombok.SneakyThrows;
import org.quartz.*;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author xiaodi.gou
 * @create 2021/11/11 11:34 上午
 */
@DisallowConcurrentExecution
@PersistJobDataAfterExecution
@Component
public class HelloJob implements Job {
    @SneakyThrows
    @Override
    public void execute(JobExecutionContext context) {

        //打印当前执行时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //编写具体的业务逻辑
        System.out.println("Hello World SchedulerName" + context.getScheduler().getSchedulerName());
        System.out.println("Hello World SchedulerId" + context.getScheduler().getSchedulerInstanceId());
        try {
            System.out.println("schedulerName:" + context.getScheduler().getSchedulerInstanceId());
            System.out.println("taskName:" + context.getJobDetail().getKey().getName());
            System.out.println("execute time:" + new Date());

        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }
}
