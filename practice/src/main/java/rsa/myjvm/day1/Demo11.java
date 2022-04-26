package rsa.myjvm.day1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/17 10:04
 */
public class Demo11 {

    public static void main(String[] args) throws IOException {

        // 第1步：使用File类找到一个文件
        File f = new File("neicunfenxi/Demo01.java"); // 声明File  对象
        // 第2步：通过子类实例化父类对象
        Writer out = null;
// 准备好一个输出的对象
        out = new FileWriter(f);
// 通过对象多态性进行实例化
        // 第3步：进行写操作
        String str = "Hello World!!!";
// 准备一个字符串
        out.write(str);
        out.flush();
// 将内容输出
        // 第4步：关闭输出流
         out.close();
// 此时没有关闭
    }
}
