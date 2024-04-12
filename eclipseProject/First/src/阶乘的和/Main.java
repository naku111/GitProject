package 阶乘的和;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] s=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			s[i]=scanner.nextInt();
			sum+=fc(s[i]);
		}
		int number=sum/4;
		int left=1;
		int right=number;
		while(left<=right) {
			int m=(left+right)/2;
			if(check(m,number)) {
				left=m+1;
			}
			else {
				right=m-1;
			}
		}
		System.out.println(left);
	}
	public static int fc(int a) {
		if(a==1) {
			return 1;
		}
		else return a*fc(a-1);
	}
	public static boolean check(int m,int sum) {
		if(fc(m)<=sum) {
			return true;
		}
		return false;
	}
}
