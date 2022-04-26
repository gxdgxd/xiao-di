package com.xiaodi.qa.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;


/**
 * @Author xiaodi.gou
 * @create 2021/8/31 3:40 下午
 */
@Slf4j
@Order(1)
public class Auto {
    private String abc;

    public static void main(String[] args) {

        //String name = "${testName}";
        //name = RegExUtils.replaceAll(name,"\\$\\{" + "testName" + "}","aaa");

        HelloRequest hello = new HelloRequest();
        System.out.println(hello.getHello());


    }


}
