package test;

import java.util.Scanner;

public class problem_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // 读取测试数据组数

        for (int i = 0; i < T; i++) {
            long a = scanner.nextLong();  // 红砖数量
            long b = scanner.nextLong();  // 蓝砖数量
            long c = scanner.nextLong();  // 绿砖数量
            long x = scanner.nextLong();  // 每x个红砖可以合成1个蓝砖
            long y = scanner.nextLong();  // 每y个蓝砖可以合成1个绿砖
            System.out.println(maxBrickSets(a,b,c,x,y));
        }

        scanner.close();
    }

    private static long maxBrickSets(long a, long b, long c, long x, long y) {
        long sets = Math.min(a, Math.min(b, c));  // 计算当前的套数
        if (sets==a) {
            return a;
        }
        long maxBlue = a / x;
        long maxGreen = (b + maxBlue) / y;
        while (maxBlue > 0 || maxGreen > 0) {
            long newA = a - maxBlue * x;
            long newB = b + maxBlue - maxGreen * y;
            long newC = c + maxGreen;
            long j=Math.min(newA, Math.min(newB, newC));
            if (j>=sets){
                return j;
            }else {
                maxGreen--;
                newB+=y;
                long i=Math.min(newA, Math.min(newB, newC));
                if (i<sets){
                    maxBlue--;
                    newA+=x;
                }
            }
        }
        return sets;
    }
}
