package com.xiaodi.qa.common;

/**
 * @Author xiaodi.gou
 * @create 2021/11/5 11:10 下午
 */
public class WhileDemo {

    public static void main(String[] args) {
        //输出10次HelloWorld
        /*
        for(int x=1; x<=10; x++) {
            System.out.println("HellloWorld");
        }
        */

        //while循环实现
        int x = 1;
        while (x <= 10) {
            System.out.println("HellloWorld");
            x++;
        }

        System.out.println("x = " + x);

    }

}
