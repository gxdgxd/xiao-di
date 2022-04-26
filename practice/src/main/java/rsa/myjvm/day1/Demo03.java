package rsa.myjvm.day1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/14 19:39
 */
public class Demo03 {

    public static void main(String[] args) {

        int[] aa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Map map = new HashMap();
        int sum = 0;
        for (int i = 0; i < aa.length; i++) {
            for (int j = i + 1; j < aa.length; j++) {
                sum = aa[i] + aa[j];
                System.out.println("两数之和=" + sum);
                map.put(sum,String.valueOf(i)+String.valueOf(j));
            }

        }
        System.out.println(map);
    }

}
