package com.xiaodi.qa.mythread;

/**
 * @Author xiaodi.gou
 * @create 2021/12/26 2:02 下午
 */
public class CreateThread extends Thread {
    @Override
    public void run() {
        System.out.println("我是新线程");
        for (int i = 0; i < 10000; i++) {
            System.out.println("i=" + i);

        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new CreateThread(), "name");
        thread.start();
        System.out.println("我必须提前完成");

    }
}
