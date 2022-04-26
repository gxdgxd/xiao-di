package com.xiaodi.qa.testcase;

import org.junit.Test;

import java.util.Random;

public class MyCase {


    @Test
    public void outString(){
        String str = "aaaaabbbbbbbbbbbbbbbbbb";
        while (true){
            str += str + new Random().nextInt(999999999)+new Random().nextInt(888888888);
        }
    }
}
