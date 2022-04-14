package com.xiaodi.qa.mythread;


/**
 * Created by xiaodi.gou on 2022/4/2
 */
public class TodayTest {


    public static void main(String[] args) {

        User1 t = new User1();
        t.start();

        int a = 10;
        synchronized (t) {
            try {
                t.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",," + (t.getSum() + a));

        }
        System.out.println("执行结束");

    }
}
