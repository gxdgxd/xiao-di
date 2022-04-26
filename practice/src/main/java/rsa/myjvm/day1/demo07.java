package rsa.myjvm.day1;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/15 11:52
 */
public class demo07 {

    public static void main(String[] args) {
        int[] aaa = {20, 70, 100, 150};
        twoIndex(new int[]{20, 70, 100, 150}, 90);
    }

    public static int[] twoIndex(int[] a, int target) {
        int[] result = new int[2];
        int length = a.length;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int first = a[i];
                int second = a[j];
                if (first + second == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    System.out.println(result[0]);
                    System.out.println(result[1]);
                }
            }
        }
        return result;
    }
}
