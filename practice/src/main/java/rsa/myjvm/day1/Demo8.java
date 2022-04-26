package rsa.myjvm.day1;

import java.io.*;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/16 21:59
 */
public class Demo8 {
    /*public static void main(String[] args) throws IOException {
        int a = System.in.read();
        System.out.println(a);
        char c = 'a';
        System.out.println((int) c);
    }*/

//    public static void main(String[] args) throws IOException {
//        int a = System.in.read();//读取一个字节 System.out.println(a);char c ='中'; System.out.println(c);}}
//        System.out.println(a);
//        char c = '中';
//        System.out.println((int) c);
//    }

    /*public static void main(String[] args) throws IOException {
        char a = (char) System.in.read();//读取一个字节 System.out.println(a);char c ='中'; System.out.println(c);}}
        System.out.println(a);
        char c = '中';
        System.out.println((int) c);
    }*/

    public static void main(String[] args) throws IOException {
        //创建一个输入流对象
        BufferedReader br = new BufferedReader(new FileReader("neicunfenxi/Demo01.java"));

        //创建一个输出流对象
        OutputStream os = System.out;


        String line;
        while ((line = br.readLine()) != null) {
            os.write(line.getBytes());
            os.write("\r\n".getBytes());
        }

        br.close();
        os.close();


    }
}
