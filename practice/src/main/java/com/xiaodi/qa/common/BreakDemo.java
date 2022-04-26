package com.xiaodi.qa.common;

/**
 * @Author xiaodi.gou
 * @create 2021/11/5 11:20 下午
 */
public class BreakDemo {

    public static void main(String[] args) {
        //break;

        for(int x=1; x<=10; x++) {
            if(x == 3) {
                break;
            }
            System.out.println("HelloWorld");
        }
    }

}
