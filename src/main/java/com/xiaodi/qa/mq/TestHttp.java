package com.xiaodi.qa.mq;

import com.alibaba.fastjson.JSONObject;
import net.dongliu.requests.Requests;
import net.dongliu.requests.Response;

/**
 * @Author xiaodi.gou
 * @create 2022/2/11 2:59 下午
 */
public class TestHttp {

    public static void main(String[] args) {

        String str1 = "abcwerthelloiodefabcdef";
        String str2 = "cvhellobnm";

    }

    public static String getHttp() {
        Response<String> response;
        response = Requests.get("http://baidu.com").verify(false).timeout(120000).send().toTextResponse();
        String body = response.body();
        System.out.println("body=" + body);
        //JSONObject jsonObj = JSONObject.parseObject(body);
        return body;
    }
}
