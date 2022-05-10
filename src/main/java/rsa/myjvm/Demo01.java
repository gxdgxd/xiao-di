package rsa.myjvm;

public class Demo01 {

    public static void main(String[] args) {
        //返回虚拟机试图使用的最大内存
        long max = Runtime.getRuntime().maxMemory();//单位:字节
        //返回虚拟机初始化的总内存
        long total = Runtime.getRuntime().totalMemory();
        System.out.println(max/(double)1024/1024);
        System.out.println(total/(double)1024/1024);

    }
}
