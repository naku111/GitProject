package test;

import java.util.Scanner;

public class problem_04 {
    static long maxTreasure = 0;
    static long max = 0;

    public static void dfs(int x, int y, int n, int m, int steps) {
        // 当前格子的价值
        long currentValue = y + x * m;

        // 更新当前宝物价值
        maxTreasure += currentValue;

        // 更新最大价值
        max = Math.max(max, maxTreasure);

        // 如果步数用尽，返回
        if (steps == 0) {
            maxTreasure -= currentValue; // 撤销当前位置的价值
            return;
        }

        // 四个方向的移动
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            // 检查新位置是否在边界内
            if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                dfs(newX, newY, n, m, steps - 1); // 递归探索新位置
            }
        }

        maxTreasure -= currentValue; // 撤销当前位置的价值
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        while (q-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            maxTreasure = 0; // 重置最大宝物价值
            max = 0; // 重置最大值
            dfs(0, 0, n, m, k); // 从起点开始 DFS
            System.out.println(max);
        }

        scanner.close();
    }
}
