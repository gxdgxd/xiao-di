package com.xiaodi.qa.mybatisplusgenerator.report;

import com.alibaba.fastjson.JSONObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author xiaodi.gou
 * @Create 2022/10/19 11:21
 */
public class Report {

    private static String filePath = "D:\\eclipse-workspace\\ac-product-net\\WebRoot\\item\\table.html";//模板地址
    private static String disrPath = "D:\\eclipse-workspace\\ac-product-net\\WebRoot\\item\\";//生成路径
    private static String fileName = ".html";

    //json为填充页面数据
    public static void MakeHtml(JSONObject json) {
        try {
            String templateContent = "";
            FileInputStream fileinputstream = new FileInputStream(filePath);// 读取模板文件
            int lenght = fileinputstream.available();
            byte bytes[] = new byte[lenght];
            fileinputstream.read(bytes);
            fileinputstream.close();
            templateContent = new String(bytes);
            String title = json.getString("title");
            String publishtime = json.getString("publish_time");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年 MM 月 dd 日 ");
            String publish_time = sdf.format(new Date(Long.parseLong(String.valueOf(publishtime))));
            System.out.println("时间转换：" + publish_time + "\n");
            //把模板页面上的 ###text### 替换成 title 里的内容
            templateContent = templateContent.replaceAll("###title###", title);
            templateContent = templateContent.replaceAll("###publish_time###", publish_time);
//        System.out.print(templateContent);
            String fileame = title + fileName;
            fileame = disrPath + fileame;// 生成的html文件保存路径。
            FileOutputStream fileoutputstream = new FileOutputStream(fileame);// 建立文件输出流
            System.out.print("文件输出路径:");
            System.out.print(fileame);
            byte tag_bytes[] = templateContent.getBytes();
            fileoutputstream.write(tag_bytes);
            fileoutputstream.close();
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
}
