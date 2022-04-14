package com.xiaodi.qa.job;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * Created by xiaodi.gou on 2022/4/7
 */
public class SupplierTest {

    public static void main(String[] args) {

        func1(() -> {
            int[] arr = {22, 33, 55, 66, 99, 10};
            Arrays.sort(arr);
            return arr[arr.length - 1];
        });


    }


    public static void func1(Supplier<Integer> supplier) {
        Integer max = supplier.get();
        System.out.println("max=" + max);

    }
}
