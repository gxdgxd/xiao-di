package rsa.myjvm.day1;

import java.util.*;

public class Demo04 {


    public static void main(String[] args) {

        Integer[] aa = {1, 2, 3, 4, 5, 6};
        Integer[] bb = {11, 22, 3, 4, 5, 6};
        getSameIds(aa, bb);
        getNotSame(aa, bb);

    }

    //求两个数组中相同的数
    private static Set<Integer> getSameIds(Integer[] a, Integer[] b) {
        Set<Integer> same = new HashSet<>();
        Set<Integer> temp = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            temp.add(a[i]);
        }
        for (int j = 0; j < b.length; j++) {

            if (!temp.add(b[j])) {
                same.add(b[j]);
            }
        }
        System.out.printf("相同元素是:" + same);
        return same;
    }

    //求两个数组中不同的数
    private static List getNotSame(Integer[] a, Integer[] b) {
        List<Integer> list1 = Arrays.asList(a);
        List<Integer> list2 = new ArrayList<>();
        for (Integer t : b) {
            if (!list1.contains(t)) {
                list2.add(t);
            }
        }
        System.out.println("不相同的元素是:" + list2);
        return list2;

    }
}
