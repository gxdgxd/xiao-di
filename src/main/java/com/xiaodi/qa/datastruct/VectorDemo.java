package com.xiaodi.qa.datastruct;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public VectorDemo() {
    }

    public static void main(String[] args) {

        Vector vector = new Vector();
        vector.add("hello1");
        vector.add("hello2");
        vector.add("hello3");
        for (int i = 0; i < vector.size(); i++) {
            String o = (String) vector.elementAt(i);
            System.out.println(o);
        }

        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()){
            String o = (String) elements.nextElement();
            System.out.println(o);
        }


    }
}
