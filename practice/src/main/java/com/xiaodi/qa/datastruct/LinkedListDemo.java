package com.xiaodi.qa.datastruct;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("hello1");
        linkedList.add("hello2");
        linkedList.add("hello3");

        linkedList.addFirst("hello");
        linkedList.addLast("he");

        System.out.println(linkedList);
        System.out.println("first" + linkedList.getFirst());
        System.out.println("last" + linkedList.getLast());

        System.out.println("removefirst=" + linkedList.removeFirst());
        System.out.println("removelast=" + linkedList.removeLast());
    }
}
