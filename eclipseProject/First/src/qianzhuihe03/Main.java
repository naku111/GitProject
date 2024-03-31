package qianzhuihe03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//求数组中某个区间和
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] a=new int[n];
		int[] sum=new int[n+1];
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		for(int i=1;i<n+1;i++) {
			sum[i]=sum[i-1]+a[i-1];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(sum));
		int m=scanner.nextInt();
		for(int i=0;i<m;i++) {
			int left=scanner.nextInt()-1;
			int right=scanner.nextInt()-1;
			System.out.println(sum[right+1]-sum[left]);
		}
	}
}
