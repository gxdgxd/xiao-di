package rsa.myjvm.day1;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/15 10:14
 */
public class Demo05 {
    public static void main(String[] args) {

        Map map = new HashMap<>();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        map.put("1", 160);
        map.put("2", 161);
        map.put("3", 162);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> next = it.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "=" + value);
        }

        for (Map.Entry<String, Integer> m : set) {
            String key = m.getKey();
            Integer value = m.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
