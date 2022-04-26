package rsa.myjvm.day1;

import java.io.*;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/17 11:08
 */
public class Demo12 {
    public static void main(String[] args) {

        //按字节读
        try {
            InputStream inputStream = new FileInputStream("neicunfenxi/Demo01.java");
            int n = 0;
            while (n != -1) {
                n = inputStream.read();
                System.out.println(n);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
