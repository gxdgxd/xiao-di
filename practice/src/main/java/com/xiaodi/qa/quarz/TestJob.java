//package com.example.demo.quarz;
//
//import org.quartz.*;
//import org.quartz.impl.StdSchedulerFactory;
//
///**
// * @Author xiaodi.gou
// * @create 2021/11/10 11:53 下午
// */
//public class TestJob {
//
//    public static void main(String[] args) {
//
//        int count1 = 0;
//        JobDetail jobDetail = JobBuilder.newJob(Myjob.class)
//                .withIdentity("job1", "group1")
//                .usingJobData("job1","jobValue")
//                .usingJobData("count1",count1)
//                .build();
//
//        int count = 0;
//        Trigger trigger = TriggerBuilder.newTrigger()
//                .withIdentity("trigger1", "trigger1")
//                .usingJobData("trigger1","triggerValue")
//                .usingJobData("count",count)
//                .startNow()
//                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1)
//                        .repeatForever()).build();
//
//        try {
//            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//            scheduler.scheduleJob(jobDetail,trigger);
//            scheduler.start();
//
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
