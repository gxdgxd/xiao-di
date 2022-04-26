package com.xiaodi.qa.quarz;


import org.quartz.*;

import java.util.Date;

/**
 * @Author xiaodi.gou
 * @create 2021/11/10 11:31 下午
 */

@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public class Myjob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {

        //System.out.println("myjob excute:" + new Date());
//        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
//        JobDataMap triggerMap = context.getTrigger().getJobDataMap();
//        JobDataMap mergeMap = context.getMergedJobDataMap();
//
//        System.out.println("jobDataMap:" + jobDataMap.getString("job1"));
//        System.out.println("triggerMap:" + triggerMap.getString("trigger1"));
//        System.out.println("mergeMap:"+ mergeMap.getString("trigger1"));

//        System.out.println(new Date());

        //
        JobDataMap jobDataMap = context.getTrigger().getJobDataMap();
        JobDataMap jobDataMap1 = context.getJobDetail().getJobDataMap();
        jobDataMap1.put("count1", jobDataMap1.getInt("count1") + 1);
        System.out.println("count = " + jobDataMap.getInt("count"));
        System.out.println("count1 = " + jobDataMap1.getInt("count1"));

    }
}
