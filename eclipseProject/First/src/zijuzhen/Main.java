package zijuzhen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int sum=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,m,a,b;
        n=scanner.nextInt();
        m=scanner.nextInt();
        a=scanner.nextInt();
        b=scanner.nextInt();
        int[][] s=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                s[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bfs(s,i,j,a,b);
            }
        }
        System.out.println(sum%998244353);
    }
    public static void bfs(int[][] s,int i,int j, int a, int b){
        int max=0;
        int min=1;
        int n=s.length;
        int m=s[0].length;
        Queue<Integer> q=new LinkedList<>();
        for (int k = 0; k < a-1; k++) {
            for (int l = 0; l < b-1; l++) {
                if(i+k<=n-1&&j+l<=m-1){
                    q.add(s[i+k][j+l]);
                }
            }
        }
        if(q.size()==(a*b)){
            while (!q.isEmpty()){
                int temp=q.poll();
                max= max>=temp ? max:temp;
                min= min<=temp ? min:temp;
            }
            sum+=max*min;
        }
        else return;
        
    }
}
