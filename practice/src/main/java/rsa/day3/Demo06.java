package rsa.day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/20 20:44
 */
public class Demo06 {
    public static void main(String[] args) {
        String[] a = {"北京", "上海"};
        String[] b = {"上海", "杭州"};

        Set set = new HashSet<String>();
        for (String s : a) {
            set.add(s);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        Object[] c = set.toArray();
        System.out.println(Arrays.toString(c));

    }

}
