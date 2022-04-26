package rsa.myjvm.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/15 11:04
 */
public class Demo06 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(1);
        System.out.println("vector=" + vector);
        int[] aa = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum;
        Map map = new HashMap();
        Map map1 = new HashMap();

        for (int i = 0; i < aa.length; i++) {

            for (int j = i + 1; j < aa.length; j++) {
                sum = aa[i] + aa[j];
                map.put(sum, i + "+" + j);
                if (map.containsKey(sum)) {
                    map1.put(sum, aa[i] + "+" + aa[j]);
                }
            }
        }
        System.out.println(map1);


    }
}
