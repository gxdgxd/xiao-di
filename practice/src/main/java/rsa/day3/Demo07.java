package rsa.day3;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/20 20:58
 */
public class Demo07 {
    public static void main(String[] args) {
//        int[] abc = {1, 1, 2, 3, 5,...};
        System.out.println("要输出结果了");
        System.out.println("n = " + outNum(100));
    }

    public static long outNum(long n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return outNum(n - 2) + outNum(n - 1);
    }
}
