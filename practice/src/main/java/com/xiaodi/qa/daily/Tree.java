package com.xiaodi.qa.daily;

/**
 * Created by xiaodi.gou on 2022/3/31
 */
public class Tree {

    public static void main(String[] args) {

        String abc = "blanna";
        int sub = 0;

        char[] b = new char[abc.length()];

        boolean find = false;
        for (int i = 0; i < abc.length(); i++) {

            for (int j = 0; j < i; j++) {
                if (b[j] == abc.charAt(i)) {
                    find = true;
                    break;
                }

            }

            if (find == false) {
                b[sub++] = abc.charAt(i);
            }
        }
        System.out.println(String.valueOf(b).trim());

    }
}
