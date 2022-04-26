package com.xiaodi.qa.controller;


import com.alibaba.fastjson.JSONArray;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * @Author xiaodi.gou
 * @create 2021/8/17 1:53 下午
 */
@Slf4j
@Data
public class Test  {

    private int a ;
    private String b ;



    //private static char[] hex = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void main(String[] args) {


        new Test().md5Salt("123456");
        for (int i = 0; i < 3; i++) {
            JSONArray idList = new JSONArray();
            idList.toJSONString();
            idList.get(i).toString();
            System.out.println(idList.size());
            System.out.println(idList.isEmpty());
        }

    }


    public void md5() {
        String keywords = "I love you";
        String s = DigestUtils.md5Hex(keywords);
        System.out.println("s=" + s);


    }

    public void md5Salt(String keywords) {
        String md5 = DigestUtils.md5Hex(keywords);
        System.out.println("md5加密后:" + "\n" + md5);
        String md5salt = md5PulsSalt(keywords);
        System.out.println("加盐后:" + "\n" + md5salt);
        String word = md5MinusSalt(md5salt);
        System.out.println("解密后" + "\n" + word);

    }

    public String md5PulsSalt(String keywords) {
        String md5 = DigestUtils.md5Hex(keywords);
        System.out.println("md5加密后：" + "\n" + md5);
        char[] carray = md5.toCharArray();
        for (int i = 0; i < carray.length; i++) {
            if (carray.length >= 48 && carray.length <= 57) {
                carray[i] = (char) (105 - carray[i]);
            }
        }
        return "".valueOf(carray);
    }

    public String md5MinusSalt(String md5) {
        char[] carray = md5.toCharArray();
        for (int i = 0; i < carray.length; i++) {
            if (carray.length >= 48 && carray.length <= 57) {
                carray[i] = (char) (105 - carray[i]);
            }
        }
        return "".valueOf(carray);
    }
}
