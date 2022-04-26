package rsa.myjvm.day1;

import java.util.Random;

public class OOM_Demo {

    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaa";
        while (true) {
            str += str + new Random().nextInt(888888888) + new Random().nextInt(998999999) + new Random().nextInt(998999999);
        }
    }
}
