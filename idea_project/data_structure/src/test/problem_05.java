package test;

import java.util.Arrays;
import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long k = scanner.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        // 1. 排序数组
        Arrays.sort(a);

        int remaining = n; // 剩余数字数量
        int i = 0; // 左指针

        // 2. 使用双指针来查找可操作的区间
        while (i <= remaining - m) { // 确保至少剩下 m 个元素可以进行操作
            int j = i + m - 1; // 右指针

            // 检查最大值和最小值的差是否小于等于 k
            if (a[j] - a[i] <= k) {
                // 符合条件，删除最小值
                remaining--; // 删除最小值
                i++; // 移动左指针
            } else {
                // 不符合条件，右移左指针
                i++;
            }
        }

        // 输出剩余的数字数量
        System.out.println(remaining);
        scanner.close();
    }
}
