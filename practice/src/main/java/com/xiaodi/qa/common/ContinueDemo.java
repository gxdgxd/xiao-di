package com.xiaodi.qa.common;

/**
 * @Author xiaodi.gou
 * @create 2021/11/5 11:22 下午
 */
public class ContinueDemo {

    public static void main(String[] args) {
        //continue;

        for (int x = 1; x <= 10; x++) {
            if (x == 3) {
                //break;
                continue;
            }
            System.out.println("HelloWorld");
        }
    }

}
