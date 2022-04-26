package com.xiaodi.qa.daily;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by xiaodi.gou on 2022/3/28
 */
public class Bishi {

    HashMap map = new HashMap();
    static Object object = new Object();
    static String a = "hello";



    public static void main(String[] args) {
        System.out.println("a的hashCode="+a.hashCode());
        object.hashCode();

        String testdict = "{'device': {'ip': '49.151.129.94', 'screenw': 720, 'screenh': 1280, 'ext': {}}, 'user': {'id': '38f552a9-598f-45de-b5d8-d4958be3798d'}, 'app': {'cat': ['IAB9', 'IAB9-30']}, 'imp': {'ext': {}}, 'ua': {}, 'Adx': 'mopub'}";

        String testdict1 = "{'device': {'ip': '49.151.129.94', 'screenw': 720, 'screenh': 1280}}";
//        HashMap map = JSON.parseObject(testdict, HashMap.class);
        HashMap map = JSON.parseObject(testdict1, HashMap.class);
        iteraJson(testdict, map);
    }

    //递归遍历解析方法
    public static boolean iteraJson(String str, Map res) {
        //因为json串中不一定有逗号，但是一定有：号，所以这里判断没有则已经value了
        if (str.toString().indexOf(":") == -1) {
            return true;
        }
        JSONObject jsonObject = JSON.parseObject(str);

        Set<String> keys = jsonObject.keySet();
        for (String key : keys) {
            System.out.println(key);
            String value = jsonObject.getString(key);
            res.put(key, value);
            if (iteraJson(value.toString(), res)) {
                System.out.println(key + "=" + value);
            }
        }
        return false;
    }
}


