package rsa.myjvm.day1;

import java.io.*;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/17 10:01
 */
public class Demo10 {
    public static void main(String[] args) throws IOException {

        // 第1步：使用File类找到一个文件
        File f = new File("neicunfenxi/Demo01.java"); // 声明File  对象
// 第2步：通过子类实例化父类对象
        OutputStream out = null;
// 准备好一个输出的对象
        out = new FileOutputStream(f);
// 通过对象多态性进行实例化
// 第3步：进行写操作
        String str = "世Hello World!!!";
// 准备一个字符串
        byte b[] = str.getBytes();
// 字符串转byte数组
        out.write(b);
// 将内容输出
        // 第4步：关闭输出流
         out.close();
// 此时没有关闭
    }
}
