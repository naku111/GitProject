package day05;

import java.util.Scanner;

public class DiGui01 {
    public static void main(String[] args) {
        int num;
        System.out.println("请输入一个整数：");
        num=new Scanner(System.in).nextInt();
        int sum;
        sum=he(num);
        System.out.println(sum);
    }

    private static int he(int num) {
        if(num==1)
            return 1;
        else
            return num+he(num-1);
    }
}
