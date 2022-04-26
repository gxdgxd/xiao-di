package com.xiaodi.qa.mylock;

import lombok.Data;

/**
 * Created by xiaodi.gou on 2022/4/1
 */
@Data
public class A {


    private int num = 0;

    public synchronized void increase() {
        num++;
    }
}
