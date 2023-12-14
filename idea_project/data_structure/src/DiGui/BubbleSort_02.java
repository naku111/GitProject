package DiGui;

import java.util.Arrays;

public class BubbleSort_02 {
    public static void main(String[] args) {
        int[] c={1,89,4,5,69,48,74,2};
        sort(c,c.length-1);
        System.out.println(Arrays.toString(c));
    }
    //x代表未排序区域右边界
    public static void sort(int[] a,int j){
        int x=0;
        if(j==0)
            return;
        for (int i = 0; i < j; i++) {
            if(a[i]>a[i+1]){
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                x=i;
            }
        }
        sort(a,x);
    }
}
