package com.xiaodi.qa.reflect;

import lombok.Data;

@Data
public class Kids implements Person {
    private String name;
    private int age;

    public Kids() {

    }


    @Override
    public void run() {
        System.out.println("小孩会跑步");
    }
}
