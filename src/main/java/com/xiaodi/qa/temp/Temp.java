package com.xiaodi.qa.temp;

import lombok.extern.slf4j.Slf4j;

import java.security.MessageDigest;
import java.util.*;

/**
 * @Author xiaodi.gou
 * @create 2021/12/17 7:41 下午
 */
@Slf4j
public class Temp {

    public static void main(String[] args) throws Exception {

        Map<String, String> map = new HashMap<>();
        map.put("outTradeNo", "2111122123v6r2w3");
        map.put("product", "1");

        String jm = getPaySign(map, "09b1zamqjvnuuc4dzloz51xlupwfjtbj");
        System.out.println("加密结果:" + jm);

    }

    public static String getPaySign(Map<String, String> data, String key) throws Exception {
//        Map<String, String> data = new HashMap<>();
//        data.put("product", "1");
//        data.put("orderNo", orderNo);
        Set<String> keySet = data.keySet();
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        Arrays.sort(keyArray);
        StringBuilder sb = new StringBuilder();
        for (String k : keyArray) {
            if (k.equals("signature"))
                continue;
            if (k.equals("sign"))
                continue;
            if (data.get(k) == null)
                continue;
            if (data.get(k).trim().length() > 0) // 参数值为空，则不参与签名
                sb.append(k).append("=").append(data.get(k).trim()).append("&");
        }
        sb.append("key=").append(key);
        return MD5(sb.toString()).toUpperCase();
    }

    public static String MD5(String data) throws Exception {
        java.security.MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] array = md.digest(data.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }

}
