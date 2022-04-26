package com.xiaodi.qa.mythread;

/**
 * Created by xiaodi.gou on 2022/4/2
 */
public class User1 extends Thread {

    int sum = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                sum += i;

            }
            System.out.println("线程名称" + Thread.currentThread().getName() + "," + sum);
            //默认隐式自动通知持有当前对象的被阻塞的线程解锁
            //this.notify();
        }
    }

    public int getSum() {
        return this.sum;
    }
}
