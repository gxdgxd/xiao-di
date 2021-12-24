package com.xiaodi.qa.temp;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaodi.gou
 * @create 2021/12/17 7:37 下午
 */
public class StringConcat5 {

    public static void main(String[] args) {
        String add = add();
        String concat = concat();
        String join = join();
        String buffer = buffer();
        String builder = builder();
    }


    public static String add() {
        String string = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            string += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("+号拼接耗时:" + (endTime - startTime));
        return string;
    }

    public static String concat() {
        String string = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            string = string.concat("a");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("concat拼接耗时:" + (endTime - startTime));
        return string;
    }

    public static String join() {
        String string = "";
        long startTime = System.currentTimeMillis();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 100000; i++) {
            list.add("a");
        }
        string = String.join(string, list);
        long endTime = System.currentTimeMillis();
        System.out.println("join拼接耗时:" + (endTime - startTime));
        return string;
    }

    public static String buffer() {
        StringBuffer sb = new StringBuffer();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer拼接耗时:" + (endTime - startTime));
        return sb.toString();
    }

    public static String builder() {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder拼接耗时:" + (endTime - startTime));
        return sb.toString();
    }

}
