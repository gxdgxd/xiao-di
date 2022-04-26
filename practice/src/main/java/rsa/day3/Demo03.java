package rsa.day3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/18 21:15
 */
public class Demo03 {

    public static void main(String[] args) {

        lexicalOrder(13);
    }

    //深度优先算法
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        //刚开始从1开始
        dfs(0, 1, n, res);
        System.out.println(res);
        return res;
    }

    //基于base不断添加个位数start
    public static void dfs(int base, int start, int n, List<Integer> res) {
        if (base > n) {
            return;
        }
        for (int i = start; i < 10; i++) {
            int num = i + base;
            if (num <= n) {
                res.add(num);
                //后面可以添加0~9
                dfs(num * 10, 0, n, res);
            }
        }
    }
}