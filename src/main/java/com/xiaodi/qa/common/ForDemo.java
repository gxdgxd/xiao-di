package com.xiaodi.qa.common;


/**
 * @Author xiaodi.gou
 * @create 2021/11/4 3:39 下午
 */
public class ForDemo {

    public static void main(String[] args) {
        //原始写法
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("-------------------------");


        //用循环改进
        for (int x = 1; x <= 10; x++) {
            System.out.println("HelloWorld");
        }
    }
}
