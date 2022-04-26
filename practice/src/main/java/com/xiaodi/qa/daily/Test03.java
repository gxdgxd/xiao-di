package com.xiaodi.qa.daily;

import java.lang.annotation.*;

public class Test03 {

    @MyAnnotation(age = 1, aihao = {"aa","bb"})
    public void test() {
        System.out.println();

    }

}

@Target(value = {ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface MyAnnotation {

    String name() default "aaa";
    int age();
    String[] aihao();

}