package BinarySearch;

public class BinarySearchLeftmost02 {
    public static int BinarySearchBasic(int[] a,int target){
        //返回>=target的最靠左索引位置
        int i=0,j=a.length-1;
        while (i<=j){
            int m=i+j >>> 1;
            if (target<=a[m]) {
                j=m-1;
            } else if (a[m]<target) {
                i=m+1;
            }
        }
        return i;
    }
}
