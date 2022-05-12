package com.xiaodi.qa;

import org.junit.Test;

public class MyTest {

    public static class MockTest {

        // 原方法签名为`String substring(int, int)`
// 调用此方法的对象`"anything"`类型为`String`
//        @MockMethod(targetClass = String.class)
        private String substring(int i, int j) {
            return "sub_string";
        }

    }

}
