package com.xiaodi.qa.xxljob;

import com.alibaba.fastjson.JSONObject;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author xiaodi.gou
 * @create 2021/12/8 3:51 下午
 */
@Slf4j
@Component
public class Mytask {

    public static void main(String[] args) {
        String a = "123456";
        System.out.println(a.substring(0,6));

        JSONObject obj = new JSONObject();
        obj.put("age",22);
        obj.put("is_student",true);


    }

    @XxlJob("mytask")
    public String firstTask() {
        log.info("执行了xxl-job任务");
        System.out.println("我是sout执行了xxl-job");

        return "success";
    }
}
