package Leetcode;

public class Problem231 {
    //快速幂
    public static void main(String[] args) {
        int a=88888888;
        int b=45345343;
        System.out.println(isPowerOfTwo(a));
        System.out.println(isPowerOfTwo(b));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n%2==0)
            return isPowerOfTwo(n/2);
        if(n==1){
            return true;
        }
        else{
            return false;
        }

    }
}
