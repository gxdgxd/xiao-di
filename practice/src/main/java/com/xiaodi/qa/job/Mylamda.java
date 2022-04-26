package com.xiaodi.qa.job;

/**
 * Created by xiaodi.gou on 2022/4/7
 */
public class Mylamda {

    public static void main(String[] args) {


        func1(arr1 -> {
            int sum = 0;
            for (int i : arr1) {
                sum += i;
            }

            return sum;
        });

    }


    static void func1(Operator operator) {
        int[] arr = {1, 2, 3, 4};
        int sum = operator.getSum(arr);
        System.out.println("sum = " + sum);
    }


    interface Operator {
        int getSum(int[] arr);
    }
}
