package DiGui;

import java.util.Arrays;

public class InsertSort_02{
    public static void main(String[] args) {
    int[] a={1,58,69,47,15,68,45};
    sort(a,1);
    System.out.println(Arrays.toString(a));
    }
        //low代表未排序区域左边界
    public static void sort(int[] a,int low){
        if(low==a.length)
            return;
        int i=low-1;
        //交换以找到位置
        while (i>=0&&a[i]>a[i+1]){
            int t=a[i+1];
            a[i+1]=a[i];
            a[i]=t;
            i--;
        }
        sort(a,low+1);
    }
}
