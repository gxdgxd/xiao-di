package com.xiaodi.qa.common;

import java.util.UUID;

/**
 * @Author xiaodi.gou
 * @create 2021/11/3 2:04 下午
 */
public class ForEachDemo {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }

        String[] names = {"James", "Larry", "Tom", "Lacy"};

        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
    }
}
