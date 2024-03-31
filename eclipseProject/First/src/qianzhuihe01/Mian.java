package qianzhuihe01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		// 前缀和
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] a=new int[n];
		int[] sum=new int[n+1];
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		for(int i=1;i<=n;i++) {
			sum[i]=sum[i-1]+a[i-1];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(sum));
	}

}
