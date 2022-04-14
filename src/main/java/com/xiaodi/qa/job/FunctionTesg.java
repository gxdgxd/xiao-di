package com.xiaodi.qa.job;

import java.util.function.Function;

/**
 * Created by xiaodi.gou on 2022/4/7
 */
public class FunctionTesg {


    public static void main(String[] args) {
        test(msg -> {
            return Integer.parseInt(msg);

        });
    }

    static void test(Function<String, Integer> function) {
        Integer apply = function.apply("666");
        System.out.println("返回结果是" + apply);


    }
}
