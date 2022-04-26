package rsa.day3;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/18 22:40
 */
public class Demo04 {
    public static void main(String[] args) {
        String str = "1";
        int num = 1;
        System.out.println(Integer.valueOf(str) == num);

        Integer num1 = 1000;
        Integer num2 = 1000;
        System.out.println(num1.equals(num2));

        String str1 = "str";
        String str2 = "str";
        System.out.println(str1 == str2);

        String str3 = "str";
        String str4 = "STR";
        System.out.println(str3.equals(str4.toLowerCase()));

    }

}
