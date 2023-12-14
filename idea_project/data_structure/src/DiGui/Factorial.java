package DiGui;

public class Factorial {
    public static void main(String[] args) {
        int a=f(5);
        System.out.println(a);
    }
    public static int f(int n){
        if(n==1)
            return 1;
        else {
            return n*f(n-1);
        }

    }
}
