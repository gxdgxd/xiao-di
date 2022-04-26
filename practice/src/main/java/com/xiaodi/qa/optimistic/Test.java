package com.xiaodi.qa.optimistic;

/**
 * Created by xiaodi.gou on 2022/4/1
 */
public class Test {


    public String addStrings(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return null;
        }
        char numChar1[] = num1.toCharArray();
        char numChar2[] = num2.toCharArray();
        int i = numChar1.length;
        int j = numChar2.length;
        int add = 0;
        StringBuilder builder = new StringBuilder();
        while (i > 0 || j > 0 || add > 0) {
            int tem = add;
            if ( i > 0) {
                i --;
                tem = tem + num1.charAt(i) - '0';
            }
            if ( j > 0) {
                j--;
                tem = tem + num2.charAt(j) - '0';
            }
            add = tem / 10;
            builder.append(tem % 10);
        }
        return builder.reverse().toString();
    }

}
