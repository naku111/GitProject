package BinarySearch;

public class BinarySearchLeftmost01 {
    public static int BinarySearchBasic(int[] a,int target){
        //当有重复元素时，寻找最左的元素
        int i=0,j=a.length-1;
        int candidate=-1;
        while (i<=j){
            int m=i+j >>> 1;
            if (target<a[m]) {
                j=m-1;
            } else if (a[m]<target) {
                i=m+1;
            }else{
                candidate=m;
                j=m;
            }
        }
        return candidate;
    }
}
