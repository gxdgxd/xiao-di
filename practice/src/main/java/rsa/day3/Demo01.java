package rsa.day3;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/18 11:23
 */
public class Demo01 {

    public static void main(String[] args) {
        String testdict = "{'device': {'ip': '49.151.129.94', 'screenw': 720, 'screenh': 1280, 'ext': {}}, 'user': {'id': '38f552a9-598f-45de-b5d8-d4958be3798d'}, 'app': {'cat': ['IAB9', 'IAB9-30']}, 'imp': {'ext': {}}, 'ua': {}, 'Adx': 'mopub'}";

        Hashtable hashtable = new Hashtable(11);
        HashMap hashMap = new HashMap(16);
        System.out.println(isJSON2(testdict));

    }

    public static boolean isJSON2(String str) {
        boolean result = false;
        try {
            Object obj= JSON.parse(str);
            System.out.println("obj=" + obj.toString());
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result=false;
        }
        return result;
    }
}
