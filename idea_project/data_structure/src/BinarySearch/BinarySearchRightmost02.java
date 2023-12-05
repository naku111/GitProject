package BinarySearch;

public class BinarySearchRightmost02 {
    public static int BinarySearchBasic(int[] a,int target){
        //返回<=target的最靠右索引位置
        int i=0,j=a.length-1;
        while (i<=j){
            int m=i+j >>> 1;
            if (target<a[m]) {
                j=m-1;
            }else{
                i=m+1;
            }
        }
        return i-1;
    }
}
