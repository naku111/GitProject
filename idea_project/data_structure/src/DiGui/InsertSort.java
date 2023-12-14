package DiGui;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] a={1,58,69,47,15,68,45};
        sort(a,1);
        System.out.println(Arrays.toString(a));
    }
    //low代表未排序区域左边界
    public static void sort(int[] a,int low){
        if(low==a.length)
            return;
        int t=a[low];
        int i=low-1;
        //找到坑再插入
        while (i>=0&&a[i]>t){
            a[i+1]=a[i];
            i--;
        }
        if(i+1!=low)
            a[i+1]=t;
        sort(a,low+1);
    }
}
