package com.xiaodi.qa.util;

import java.io.IOException;

/**
 * @Author xiaodi.gou
 * @Create 2022/10/19 11:48
 */
public class FreeMarkerUtil {

    private static final String htmlUrl = "C:\\Users\\ysx\\Desktop\\xxx\\";//生成静态html文件的位置

    private static final Version configVersion = Configuration.VERSION_2_3_28;//版本

    private static final Configuration config = new Configuration(configVersion);//单例

    private FreeMarkerUtil(){}

    /**
     * @param templateName 模板名字
     * @param root 模板根 用于在模板内输出结果集
     * @param indexFileName 输出对象 具体输出到哪里
     */
    public static void processTemplate(String templateName, Map<?,?> root, String indexFileName){
        Writer out = null;
        try{
            out = new OutputStreamWriter(new FileOutputStream(htmlUrl+indexFileName),"UTF-8");
            //获得模板
            Template template=config.getTemplate(templateName,"utf-8");
            //生成文件（这里是我们是生成html）
            template.process(root, out);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }finally{
            try {
                out.close();
                out=null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 初始化模板配置
     * @param templateDir 模板位置
     */
    public static void initConfig(String templateDir){
        config.setLocale(Locale.CHINA);
        config.setDefaultEncoding("utf-8");
        config.setEncoding(Locale.CHINA, "utf-8");
        config.setClassForTemplateLoading(FreeMarkerUtil.class,templateDir);
        config.setObjectWrapper(new DefaultObjectWrapper(configVersion));
    }

    /**
     * 默认模板位置
     */
    static {
        initConfig("/templates");
    }
}

