package erweiqianzhuihe;

import java.util.Scanner;

public class Main {
    static int N=510;
    static int[][] a=new int[N][N];
    static int[][] s=new int[N][N];
    static int res=0;
    public static void main(String[] args) {
    	//给定一个 N × M 的矩阵 A，请你统计有多少个子矩阵 
    	//(最小 1 × 1，最大 N × M) 满足子矩阵中所有数的和不超过给定的整数K?     
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        //从下标一存储，防止越界
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m;j++) {
                s[i][j]=s[i-1][j]+s[i][j-1]-s[i-1][j-1]+a[i][j];
                //二维前缀和公式
                //S[i][j]代表的是以左上坐标为[1,1]右下角坐标为[i][j]的子矩阵之和。
            }
        }
        //枚举左上角坐标
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                //枚举右下标
                for (int l = i; l <=n; l++) {
                    for (int o = j; o <=m; o++) {
                        if (check(i,j,l,o,k)) res++;
                        else break;
                    }
                }
            }
        }
        System.out.println(res);
    }
    //判断该矩阵和是否小于k
    static boolean check(int x1,int y1,int x2,int y2,int k){
        int h=s[x2][y2]-s[x1-1][y2]-s[x2][y1-1]+s[x1-1][y1-1];//利用前缀和矩阵求指定矩阵的和
        return h<=k;
    }
}