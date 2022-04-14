package com.xiaodi.qa.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception {


        /*String str = "com.xiaodi.qa.reflect.Kids";
        Class cls = Class.forName(str);
        Object o = cls.newInstance();
        Method m = cls.getMethod("run");
        m.invoke(o);*/

//        String str = "com.xiaodi.qa.reflect.Person";
//        Class cls = Class.forName(str);
//        if (cls == null) {
//            System.out.println("接口没有类对象");
//        }
//        System.out.println("cls"+cls.getName());

        //获取注解
        Class c = Class.forName("com.xiaodi.qa.reflect.Student");
        Annotation[] annotations = c.getAnnotations();
        for (Annotation a : annotations) {
            System.out.println("注解是" + a);
        }

        //获取注解的参数
        TableName annotation = (TableName) c.getAnnotation(TableName.class);
        System.out.println(annotation.value());

        //获取属性注解的参数值
        Field fname = c.getDeclaredField("age");
        FileldName fn = fname.getAnnotation(FileldName.class);
        System.out.println(fn.columnName());
        System.out.println(fn.type());
        System.out.println(fn.length());
        new Thread().start();


    }
}
