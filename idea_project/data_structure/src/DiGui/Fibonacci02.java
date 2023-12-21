package DiGui;

import java.util.Arrays;

public class Fibonacci02 {
    //记忆法实现递归
    public static void main(String[] args) {
        int a=fib(10);
        System.out.println(a);
    }
    public static int fib(int n){
        int[] cache=new int[n+1];
        Arrays.fill(cache,-1);
        cache[0]=0;
        cache[1]=1;
        return f(n,cache);
    }
    public static int f(int n,int[] cache){
        if(cache[n]!=-1){
            return cache[n];
        }
        int x=f(n-1,cache);
        int y=f(n-2,cache);
        cache[n]=x+y;
        return cache[n];
    }
}
