package com.xiaodi.qa.common;

import java.util.Scanner;

/**
 * @Author xiaodi.gou
 * @create 2021/10/27 9:52 下午
 */
public class SwitchDemo {

    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.println("请输入一个数字(1-7)：");
        int weekday = sc.nextInt();

        //switch语句实现选择
        switch (weekday) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数字有误");
                break;
        }
    }
}
