package com.xiaodi.qa.temp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author xiaodi.gou
 * @create 2021/12/17 7:26 下午
 */
public class CreateObject4 {

    public static void main(String[] args) throws Exception {
        // 1、使用new关键值创建对象
        Order order1 = new Order();
        order1.setCode("111");
        order1.setName("订单1");
        System.out.println(order1);

        // 2、使用clone
        Order order2 = new Order();
        Object clone = order2.clone();
        System.out.println(clone);

        // 3、使用反射
        Class c = Class.forName("com.xiaodi.qa.temp.Order");
        Object o = c.newInstance();
        System.out.println(o);

        // 4、反序列化
        // 先序列化
        Order order3 = new Order();
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("order.obj"));
        os.writeObject(order3);
        // 再反序列化
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("order.obj"));
        Object o1 = is.readObject();
        System.out.println(o1);
    }

}
