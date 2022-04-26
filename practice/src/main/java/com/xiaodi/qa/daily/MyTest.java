package com.xiaodi.qa.daily;


/**
 * Created by xiaodi.gou on 2022/3/31
 */
public class MyTest {

    public static void main(String[] args) {
        String testdict = "{'device': {'ip': '49.151.129.94', 'screenw': 720, 'screenh': 1280, 'ext': {}}, 'user': {'id': '38f552a9-598f-45de-b5d8-d4958be3798d'}, 'app': {'cat': ['IAB9', 'IAB9-30']}, 'imp': {'ext': {}}, 'ua': {}, 'Adx': 'mopub'}";

        int f = f(7);
        System.out.println("f = " + f);

    }

    static int f(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        return f(n - 1) + f(n - 2);
    }

}
