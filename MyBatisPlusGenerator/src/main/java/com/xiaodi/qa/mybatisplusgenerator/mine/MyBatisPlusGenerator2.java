package com.xiaodi.qa.mybatisplusgenerator.mine;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MyBatisPlusGenerator2 {

    public static void main(String[] args) {

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/autotest?useUnicode=true&characterEncoding=utf8&useSSL=false", "root", "GXDgxd19900213")
                .globalConfig(builder -> {
                    builder.author("xiaodi.gou") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
//                            .outputDir("/Users/xiaodi.gou/Downloads/code/java-code/testreport-be/src/main/java"); // 指定输出目录
                            .outputDir("/Users/xiaodi/gkcs/autotest/testreport-be/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.kernelsoft.qa") // 设置父包名
                            .moduleName("") // 设置父包模块名
//                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "/Users/xiaodi.gou/Downloads/code/java-code/testreport-be/src/main/java/com/kernelsoft/qa/mapper")); // 设置mapperXml生成路径
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "/Users/xiaodi/gkcs/autotest/testreport-be/src/main/java/com/kernelsoft/qa/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_report_copy","t_testcase","t_caseresult") // 设置需要生成的表名
                            .addTablePrefix("t_", ""); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();


    }
}