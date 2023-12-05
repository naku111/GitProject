package BinarySearch;

public class BinarySearchBalance {
    public static int BinarySearchBasic(int[] a,int target){
        //左闭右开
        int i=0;
        int j=a.length;
        while (1<j-i){
            int m=(i+j) >>> 1;
            if(target<a[m]){
                j=m;
            } else {
                i=m;
            }
        }
        if(a[i]==target){
            return i;
        } else {
            return -1;
        }
    }
}
