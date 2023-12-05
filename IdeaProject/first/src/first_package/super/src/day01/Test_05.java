package day01;

import java.util.Arrays;

public class Test_05 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);//获取当前系统毫秒值

        int[] a={0,0,0,0,0,0};
        int[] b={2,2,2,2,2,2};
        System.arraycopy(a,0,b,0,4);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
