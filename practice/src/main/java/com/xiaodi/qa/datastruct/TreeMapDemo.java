package com.xiaodi.qa.datastruct;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("ccc",88.0);
        treeMap.put("ppp",8.9);
        treeMap.put("aaa", 11.1);
        treeMap.put("bbb", 22.2);
        System.out.println(treeMap);
        //
        String[] phones={"iphone4","iphone4s","iphone5","iphone5s"};
        //找到iphone5的位置
        int index=-1;
        for(int i=0;i<phones.length;i++){
            if(phones[i].equals("iphone5")){//注意这里只能用equals,不能用="iphone5"
                index=i;
                break;
            }
        }
        System.out.println("index="+index);
        String edit="iphone6";
        phones[index]=edit;
        for(int i=0;i<phones.length;i++){
            System.out.print(phones[i]+"\t");
        }


    }
}
