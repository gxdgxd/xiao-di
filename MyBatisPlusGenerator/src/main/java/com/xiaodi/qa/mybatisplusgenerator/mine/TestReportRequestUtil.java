package com.xiaodi.qa.mybatisplusgenerator.mine;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.json.XML;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class TestReportRequestUtil {
    public static String gTestSdk(String xmlPath) throws Exception {
//        xmlPath = "/Users/kernelsoft/Downloads/Test.xml";
        String xmlStr = readCityFile(xmlPath);
        String json = xml2jsonString(xmlStr);
        JSONObject object = JSONObject.parseObject(json);
        System.out.println(object.getJSONObject("Site").getJSONObject("Testing").get("StartTestTime"));
        System.out.println(object.getJSONObject("Site").getJSONObject("Testing").get("EndTestTime"));

        long time1 = object.getJSONObject("Site").getJSONObject("Testing").getLong("StartTestTime");
        String result1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time1 * 1000));
        System.out.println(result1);

        long time2 = object.getJSONObject("Site").getJSONObject("Testing").getLong("EndTestTime");
        String result2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time2 * 1000));
        System.out.println(result2);

        long millisecond = time2 - time1;


//        writeTxt("C:\\Users\\iscas\\Desktop\\a.json",json);
        Integer caseSum = 982;
        Integer passSum = 982;
        Integer failSum = 0;
        String buildName = "Linux-cc";
        String buildStamp = "20221021-0142-Experimental";
        String name = "dev40";
        String generator = "ctest-3.16.3";
        String oSName = "Linux";
        String hostname = "dev40";
        String osRelease = "5.4.0-125-generic";
        String osVersion = "#141-Ubuntu SMP Wed Aug 10 13:42:03 UTC 2022";
        String osPlatform = "x86_64";
        String is64Bits = "1";
        String vendorString = "GenuineIntel";
        String vendorId = "Intel Corporation";
        String familyId = "6";
        String modelId = "106";
        String processorCacheSize = "30720";
        String numberOfLogicalcpu = "4";
        String numberOfPhysicalcpu = "4";
        String totalVirtualMemory = "2047";
        String totalPhysicalMemory = "7956";
        String logicalProcessorsPerPhysical = "1";
        String processorClockFrequency = "2294.61";

//        String request = "";
        String reportType = "单元测试";
        List<?> list = (net.sf.json.JSONArray) getJsonValueHandle("Site__Testing__Test", json);
        System.out.println("我的caseDetail=" + list);
//        List list = Arrays.asList(temp);


        String source = "DDS单元测试";
        String operator = "孙力子";
        String start = result1;
        String end = result2;
        String duration = String.valueOf(millisecond);
        String os = "Linux";
        String language = "C";
        String testUrl = "";
        String projectUrl = "git工程地址";
//        String status = "";
        String projectName = "cyclonedds-qh";
//        String branch = "master";
        String execPath = "/test/insert";


//        System.out.println(list.size());


        sendTestReportRequest(caseSum, passSum, failSum, buildName, buildStamp, name
                , generator, oSName, hostname, osRelease, osVersion, osPlatform, is64Bits, vendorString,
                vendorId, familyId, modelId, processorCacheSize, numberOfLogicalcpu,
                numberOfPhysicalcpu, totalVirtualMemory, totalPhysicalMemory, logicalProcessorsPerPhysical
                , processorClockFrequency, source, operator, start, end,
                duration, os, language, testUrl, projectUrl, projectName, execPath, list, reportType);
        return "";
    }


    public static String sendTestReportRequest(
            Integer caseSum,
            Integer passSum,
            Integer failSum,
            String buildName,
            String buildStamp,
            String name,
            String generator,
            String oSName,
            String hostname,
            String osRelease,
            String osVersion,
            String osPlatform,
            String is64Bits,
            String vendorString,
            String vendorId,
            String familyId,
            String modelId,
            String processorCacheSize,
            String numberOfLogicalcpu,
            String numberOfPhysicalcpu,
            String totalVirtualMemory,
            String totalPhysicalMemory,
            String logicalProcessorsPerPhysical,
            String processorClockFrequency,
            String source,
            String operator,
            String start,
            String end,
            String duration,
            String os,
            String language,
            String testUrl,
            String projectUrl,
            String projectName,
            String execPath,
            List<?> list,
            String reportType


    ) {
        String result = "";
        Unirest.setTimeouts(10000, 10000);
        try {
            TestReportRequest testReportRequest = new TestReportRequest();
            testReportRequest.setBuildName(buildName);
            testReportRequest.setBuildStamp(buildStamp);
            testReportRequest.setName(name);
            testReportRequest.setGenerator(generator);
            testReportRequest.setOsName(oSName);
            testReportRequest.setCaseSum(caseSum);
            testReportRequest.setPassSum(passSum);
            testReportRequest.setFailSum(failSum);
            testReportRequest.setHostName(hostname);
            testReportRequest.setOsRelease(osRelease);
            testReportRequest.setOsVersion(osVersion);
            testReportRequest.setOsPlatform(osPlatform);
            testReportRequest.setIs64Bits(is64Bits);
            testReportRequest.setVendorString(vendorString);
            testReportRequest.setVendorId(vendorId);
            testReportRequest.setFamilyId(familyId);
            testReportRequest.setModelId(modelId);
            testReportRequest.setProcessorCacheSize(processorCacheSize);
            testReportRequest.setNumberOfLogicalcpu(numberOfLogicalcpu);
            testReportRequest.setNumberOfPhysicalcpu(numberOfPhysicalcpu);
            testReportRequest.setTotalVirtualMemory(totalVirtualMemory);
            testReportRequest.setTotalPhysicalMemory(totalPhysicalMemory);
            testReportRequest.setLogicalProcessorsPerPhysical(logicalProcessorsPerPhysical);
            testReportRequest.setProcessorClockFrequency(processorClockFrequency);
            testReportRequest.setSource(source);
            testReportRequest.setOperator(operator);
            testReportRequest.setStart(start);
            testReportRequest.setEnd(end);
            testReportRequest.setDuration(duration);
            testReportRequest.setOs(os);
            testReportRequest.setLanguage(language);
            testReportRequest.setTestUrl(testUrl);
            testReportRequest.setProjectUrl(projectUrl);
            testReportRequest.setProjectName(projectName);
            testReportRequest.setExecPath(execPath);
            testReportRequest.setReportType(reportType);

            List<JSONObject> jsonObjectList = JSONObject.parseArray(JSON.toJSONString(list), JSONObject.class);
//            for (JSONObject j:jsonObjectList) {
//                TestReportRequestUtil testReportRequestUtil = new TestReportRequestUtil();
//                if (testReportRequestUtil.isJSON(j.toJSONString())){
//                    System.out.println("第" + j + "个数据正确");
//                }
//            }
            for (int i = 0; i < jsonObjectList.size(); i++) {
                TestReportRequestUtil testReportRequestUtil = new TestReportRequestUtil();
                if (testReportRequestUtil.isJSON(jsonObjectList.get(i).toJSONString())){
                    System.out.println("第" + i + "个数据正确");
                }
            }


            testReportRequest.setCaseDetail(jsonObjectList);
//            System.out.println(JSON.toJSONString(testReportRequest));
            HttpResponse<String> response = Unirest.post("http://127.0.0.1:8080/report/saveTestResult")
                    .header("Content-Type", "application/json")
                    .body(JSON.toJSONString(testReportRequest))
                    .asString();
//            System.out.println(JSON.toJSONString(testReportRequest));

            result = response.getBody();
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("调用测试报告平台接口异常: " + e.getMessage());
            result = "";
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void writeTxt(String path, String data) throws Exception {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static String readCityFile(String xmlPath) {
        File file02 = new File(xmlPath);
        FileInputStream is = null;
        StringBuilder stringBuilder = null;
        try {
            if (file02.length() != 0) {
                is = new FileInputStream(file02);

                InputStreamReader streamReader = new InputStreamReader(is);
                BufferedReader reader = new BufferedReader(streamReader);
                String line;
                stringBuilder = new StringBuilder();
                while ((line = reader.readLine()) != null) {
// stringBuilder.append(line);
                    stringBuilder.append(line);
                }
                reader.close();
                is.close();
            } else {
                throw new Exception("111");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.valueOf(stringBuilder);
    }

    public static String xml2jsonString(String xmlPath) throws Exception {
        org.json.JSONObject object = XML.toJSONObject(xmlPath);
        return object.toString();
    }

    public static Object getJsonValueHandle(String expression, String body) throws Exception {
        String[] logicLoop = expression.split("__");
        net.sf.json.JSONObject jsonObj = new net.sf.json.JSONObject();
        if (body.startsWith("[")) {
            net.sf.json.JSONArray jsonArray = net.sf.json.JSONArray.fromObject(body);
            jsonObj.put("key", jsonArray);
        } else {
            jsonObj = net.sf.json.JSONObject.fromObject(body);
        }
        Object obj = jsonObj;
        try {
            for (int i = 0; i < logicLoop.length; i++) {
                if (logicLoop[i].matches(".*[a-zA-Z]+.*")) {  // 包含字母  判断为对象
                    obj = ((net.sf.json.JSONObject) obj).get(logicLoop[i]);
                } else {
                    obj = ((net.sf.json.JSONArray) obj).get(Integer.parseInt(logicLoop[i]));
                }
            }
        } catch (Exception ex) {
            System.out.println("##############Load json error, Please check your expression:" + expression);
            System.out.println("##############Load json error, Please check your: " + ex.getMessage());
            return "";
//            throw new Exception("Load json error, Please check your expression", ex);
        }

//        String result = "";
//        if(obj != null){
//            result = obj.toString().trim();
//        }

        return obj;
    }

    public static void main(String[] args) {
        String xmlPath = "/Users/xiaodi.gou/Downloads/Test.xml";
        try {
            gTestSdk(xmlPath);
//            sendTestReportRequest();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        List<SettingsCaseResult> settingsCaseResultList = new ArrayList<>();
//        SettingsCaseResult settingsCaseResult1 = new  SettingsCaseResult();
//        settingsCaseResult1.setCaseStatus("true");
//        settingsCaseResult1.setCaseNum(1);
//
//        SettingsCaseResult settingsCaseResult2 = new  SettingsCaseResult();
//        settingsCaseResult2.setCaseStatus("true");
//        settingsCaseResult2.setCaseNum(1);
//
//        settingsCaseResultList.add(settingsCaseResult1);
//        settingsCaseResultList.add(settingsCaseResult2);
//
//        String result = sendTestReportRequest("产品名称51",
//                "执行环境",
//                "任务id",
//                "任务名称",
//                "执行任务id",
//               3,
//                1,
//                2,
//                "成功用例编号1，成功用例编号2",
//                "失败用了编号1，失败用了编号2",
//                settingsCaseResultList,
//                "接口测试"
//        );
//        System.out.println(result);
    }

    public boolean isJSON(String str) {
        boolean result = false;
        try {
            Object obj = JSON.parse(str);
            result = true;
        } catch (Exception e) {
            result = false;
        }
        return result;
    }
}
