package 奇怪的数;

import java.net.Socket;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static int k=0;
	static int b=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n,m;
		int ans=0;
		n=scanner.nextInt();
		k=n;
		m=scanner.nextInt();
		b=m;
		for(int i=(int) Math.pow(10, n-1);i<=(int) Math.pow(10, n)-1;i++) {
			if(check(i))
				ans++;
		}
		System.out.println(ans);
	}
	public static boolean check(int a) {
		int[] num=new int[k];
		boolean flag=true;
		int temp=a;
		int count=0;
		int i=0;
		while(temp>0) {
			int k=temp%10;
			temp=temp/10;
			count++;
			num[i]=k;
			i++;
			if(count%2==1) {
				if(k%2!=1)
					return false;
			}
			else if(count%2==0) {
				if(k%2!=0)
					return false;
			}
		}
		for(int j=0;j<=num.length-5;j++) {
			if(num[j]+num[j+1]+num[j+2]+num[j+3]+num[j+4]>b)
				return false;
		}
		return flag;
	}

}
