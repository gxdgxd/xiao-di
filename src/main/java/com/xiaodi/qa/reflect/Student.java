package com.xiaodi.qa.reflect;



@TableName(value = "db_test")
public class Student {

    @FileldName(columnName = "name", type = "varchar(10)")
    private String name;

    @FileldName(columnName = "home", type = "int", length = 8)
    private int age;

}
