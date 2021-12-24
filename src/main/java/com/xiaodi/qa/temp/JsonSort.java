//package com.wpt.qa.temp;
//
//import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;
//import org.apache.commons.codec.digest.DigestUtils;
//import java.util.Date;
//import org.apache.jmeter.config.*;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//
//import com.alibaba.fastjson.JSONObject;
//import java.util.Map.Entry;
//import java.util.*;
//
///**
// * @Author xiaodi.gou
// * @create 2021/12/20 10:18 上午
// */
//public class JsonSort {
//
//
//
//    Arguments args = sampler.getArguments();   // 截获请求，包含url、headers 和 body 三部分
//    Argument arg_body = args.getArgument(0);   // 获取请求body
//    String body = arg_body.getValue();         // 获取body的值保存成字符串
//    JSONObject jso = JSON.parseObject(body);   // 把body转成json对象，注意！这里因为body本身就是json字符串，所以用json类处理，xml或其他格式的不能这样处理！！
//    public class JsonSort {
//        public static String getSortJson(JSONObject json){
//            SortedMap map = new TreeMap();
//            for (Map.Entry entry : json.entrySet()) {
//                if(entry.getValue().toString().equals("true")){
//                    map.put(entry.getKey().toString(), "1");
//                    continue;
//                }
//                map.put(entry.getKey().toString(), entry.getValue());
//            }
//
//            JSONObject jsonNew = new JSONObject(map);
//            String params = new String();
//            for (Map.Entry entry : jsonNew.entrySet()) {
//                if (entry.getKey().toString().contains("sign")||entry.getValue().toString().equals("0")){
//                    continue;
//                }
//                if (entry.getValue().toString().isEmpty()){
//                    continue;
//                }
//                if(entry.getValue().toString().equals("false")){
//                    continue;
//                }
//                params += entry.getKey().toString() + "=" + entry.getValue() +"&";
//
//            }
//            System.out.println("----" + params);
//
//            String key = "EDrtuR1CIn4C0l7kgdT6AH6B3odI1jDj";
//            // String key=vars.get("signKey");
//            String md5param = params+"key"+"="+key;
//            log.info("-----------签名数据----------"+md5param);
//            return md5param;
//        }
//    }
//    String md5data = JsonSort.getSortJson(jso);
//    String sign = DigestUtils.md5Hex(md5data).toUpperCase();
//
//log.info("-----------签名signature----------"+sign);
//
//
////替换 timestamp 和 sign 字段的值到jsonObject
//// jso.put("TimeStamp",Integer.parseInt(timestamp));
//jso.put("signature",sign);
//
//    body = jso.toString();
//arg_body.setValue(body); // 将新body替换到取样器的参数中，实现了截获 → 修改 → 发送修改后的内容
//
//}
