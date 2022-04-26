package rsa.day3;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/19 20:19
 */
public class Demo05 {
    public static void main(String[] args) {

        //排序前
        int[] a = new int[]{11, 12, 3, 4, 15, 6, 7, 9, 2, 100};


        int[] b = sortAsc(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);

        }
    }

    private static int[] sortAsc(int[] a) {
        if (a.length == 0 || a.length == 1) {
            return a;
        }

// 由小到大排序
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                int temp;
                if (a[j] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

}
