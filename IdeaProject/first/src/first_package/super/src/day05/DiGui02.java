package day05;

import java.util.Scanner;

public class DiGui02 {
    public static void main(String[] args) {
        int num;
        int sum;
        System.out.println("请输入一个整数");
        num=new Scanner(System.in).nextInt();
        sum=jiechen(num);
        System.out.println(sum);
    }

    private static int jiechen(int num) {
        if (num==1)
            return 1;
        else
            return num*jiechen(num-1);
    }
}
