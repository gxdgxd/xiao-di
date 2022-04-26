package com.xiaodi.qa.daily;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by xiaodi.gou on 2022/3/31
 */
public class Mianshi {


    public static void main(String[] args) {

//        String param = "blanna";
        String param = "blannadjjjjs;dkkadkddd";
//        String param = "blannadjjjjs;dkkadkddd#$%^&&&**";
        //自负类型，长度，符号，次数，边界，为空

        test(param);


    }

    static String test(String param) {

        char buf[] = new char[param.length()];//创建一个辅助的空数组
        int sub = 0;
        boolean find = false;
        for (int l = 0; l < param.length(); l++) {
            find = false;
            //从头到尾搜索辅助的数组里有没有出现重复的字符
            for (int i = 0; i < l; i++) {
                if (buf[i] == param.charAt(l)) {
                    find = true;//标记为找到，后面不进行填充
                    break;//找到重复的，跳出循环
                }
            }
            //如果在辅助数组没有找到重复的字符，填充该字符
            if (find == false) buf[sub++] = param.charAt(l);
        }
        System.out.println(String.valueOf(buf).trim());
        return String.valueOf(buf).trim();
    }


}
