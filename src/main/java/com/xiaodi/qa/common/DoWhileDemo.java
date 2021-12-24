package com.xiaodi.qa.common;

/**
 * @Author xiaodi.gou
 * @create 2021/11/5 11:14 下午
 */
public class DoWhileDemo {
    public static void main(String[] args) {

        //输出10次 HelloWorld
        /*
        for(int x=1; x<=10; x++) {
            System.out.println("HelloWorld");
        }
        */


        //do...while改写
        int x = 1;
        do {
            System.out.println("HelloWorld");
            x++;
        } while (x <= 10);
    }
}
