package BinarySearch;

import org.junit.Test;

public class BinarySearch_01 {
    public static int BinarySearchBasic(int[] a,int target){
        int i=0,j=a.length-1;
        while (i<=j){
            int m=i+j >> 1;
            if (target<a[m]) {
                j=m-1;
            } else if (a[m]<target) {
                i=m+1;
            }else return m;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] b={2,6,34,56,78,100};
        int i = BinarySearchBasic(b, 2);
        System.out.println(i);
    }
}
