package com.xiaodi.qa.job;

import java.util.function.Consumer;

/**
 * Created by xiaodi.gou on 2022/4/7
 */
public class ConsumerTest {

    public static void main(String[] args) {
        test((msg) -> {
            System.out.println("转换为小写" + msg.toLowerCase());

        });
    }

    public static void test(Consumer<String> consumer) {
        consumer.accept("Hello World");
    }
}
