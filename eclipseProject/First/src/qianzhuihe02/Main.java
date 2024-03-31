package qianzhuihe02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//求连续区间的和是k的倍数的个数
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		int[] f=new int[k];
		f[0]=1;
		long sum=0,ans=0;
		for(int i=0;i<n;i++) {
			sum+=scanner.nextLong();
			ans+=f[(int)sum%k];
			f[(int)sum%k]++;
		}
		System.out.println(ans);
	}

}
