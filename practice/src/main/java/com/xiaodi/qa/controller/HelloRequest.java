package com.xiaodi.qa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xiaodi.gou
 * @create 2021/10/29 10:46 上午
 */
@RestController
public class HelloRequest {


    @GetMapping("/hello")
    public Test getHello() {

        Test test = new Test();

        test.setA(1);
        return test;
    }

    public int addInt(int a, int b) {
        System.out.println("方法执行了");
        return a + b;
    }

}
