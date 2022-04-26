package com.xiaodi.qa.jmeter;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jayway.jsonpath.JsonPath;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONString;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author xiaodi.gou
 * @create 2021/12/27 7:47 下午
 */
@Slf4j
public class TestJsonPath {

    public static void main(String[] args) {
//        String result = "{\"code\":200,\"data\":\"ddd\",\"message\":\"健康检查正常\",\"success\":true}";
        String result = "{\"code\":200,\"data\":[{\"name\":\"abc\"},{\"name\":\"xyz\"}],\"success\":true,\"message\":\"健康检查正常\"}";

        log.info("result = " + result);
//        JSONObject jsonObject = JSONObject.parseObject(result);
//        log.info("jsonObject=" + jsonObject.get("data"));
//        String message = JsonPath.read(jsonObject, "$.data");
        Object my = JsonPath.read(result, "$.data");
        log.info("my = " + my);
        String jsonString = my.toString();
        JSONArray sales = JSONObject.parseArray(jsonString);
        log.info("sales = " + sales);

        String name = "abc";
        String age = "ABC";
        boolean b = name.equalsIgnoreCase(age);

        System.out.printf("比较结果是：" + b);

    }


}
