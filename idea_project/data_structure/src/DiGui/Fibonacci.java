package DiGui;

public class Fibonacci {
    public static void main(String[] args) {
        int a=f(10);
        System.out.println(a);
    }
    public static int f(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return f(n-1)+f(n-2);
    }
}
