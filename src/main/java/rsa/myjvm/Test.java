package rsa.myjvm;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaa";
        while (true) {
            str += str + new Random().nextInt(888888888) + new Random().nextInt(998999999) + new Random().nextInt(998999999);
        }
    }
}
