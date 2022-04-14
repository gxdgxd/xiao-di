package com.xiaodi.qa.datastruct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListDemo {

    //ArrayList LinkedList Vector

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello1");
        arrayList.add("hello2");
        arrayList.add("hello3");

        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            String s = (String)it.next();
            System.out.println(s);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String s = (String) arrayList.get(i);
            System.out.println(s);

        }
    }


}
