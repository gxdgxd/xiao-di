package com.xiaodi.qa.temp;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import net.dongliu.requests.Requests;
import net.dongliu.requests.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xiaodi.gou
 * @create 2021/11/24 11:54 上午
 */
@Slf4j
public class DongLiuRequests {

    public static void main(String[] args) {

        Response<String> result = Requests.get("http://www.baidu.com").verify(false).send().toTextResponse();
        log.info("code =" + result.statusCode());
    }


//    public static void main(String[] args) {
//
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        JSONArray list = new JSONArray();
//        String[] arr = {"userinfoId", "uri"};
//        JSONObject params = new JSONObject();
//        params.put("identity", "8612384");
//        params.put("field", arr);
//
//        Map<String, String> header = new HashMap<>();
//        header.put("host", "test-micro-gw.wptqc.com");
//        header.put("Content-Type", "application/json");
//        header.put("Content-Length", "");
//
//
//        Test test = new Test();
//        test.startPhpPost("http://10.4.4.103", "/user/info/get-base-info", params.toJSONString(),header);
//
//
//    }
//
//    public void startPhpPost(String host, String method, String params, Map<String, String> headers) {
//        Response<String> resp;
//        resp = Requests.post(host + method).headers(headers).verify(false).body(params).timeout(60000).send().toTextResponse();
//        System.out.println(resp.statusCode());
//    }
}
