package rsa.myjvm.day1;

import java.io.*;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/16 23:36
 */
public class Demo9 {

    public static void main(String[] args) throws IOException {

        //字节
//        OutputStream os = System.out;
//        os.write(97);
//        os.close();

        BufferedReader br = new BufferedReader(new FileReader("neicunfenxi/Demo01.java"));

//        Writer w = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //字符
//        Writer w = new OutputStreamWriter(System.out);
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();

    }
}
