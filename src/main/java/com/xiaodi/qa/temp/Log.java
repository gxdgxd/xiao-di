package com.xiaodi.qa.temp;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author xiaodi.gou
 * @create 2022/1/28 5:33 下午
 */
@Slf4j
public class Log {


    public static void main(String[] args) {

        Integer hostId = 1;
        String execCommand = "abc";
        log.info(String.format("修改系统时间host_id:%d,exec_command:%s",hostId,execCommand));
        //log.info("修改系统时间host_id:%d,exec_command:%s",hostId,execCommand);


    }
}
