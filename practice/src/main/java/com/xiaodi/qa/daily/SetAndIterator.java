package com.xiaodi.qa.daily;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by xiaodi.gou on 2022/4/8
 */
public class SetAndIterator {

        /**
         * 关于set集合和Iterator迭代器的使用
         * @discribe set集合特点：无序-不重复
         * @discribe 1.set集合元素的添加
         * @discirbe 2.Iterator迭代器的使用
         * @discirbe 3.set集合元素的删除
         * */
        public static void main(String[] args) {
            //1.set集合元素的添加
            Set<String> set = new HashSet<String>();
            set.add("a");
            set.add("b");
            set.add("c");
            //2.Iterator迭代器的使用
            Iterator<String> iterator = set.iterator();
            while(iterator.hasNext()){
                String str = iterator.next();
                if(str.equals("b")){
                    System.out.println("... " + str);
                    //3.set集合元素的删除
                    iterator.remove();
                }
            }

            System.out.println("... " + set.size());

            Iterator<String> iterator2 = set.iterator();
            while(iterator2.hasNext()){
                System.out.println("iterator2... " + iterator2.next());
            }

        }

    }
