package lanqiaobei01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//二分，分巧克力
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int[] h=new int [n];
		int[] w=new int[n];
		for(int i=0;i<n;i++) {
			h[i]=scan.nextInt();
			w[i]=scan.nextInt();
		}
		int left=1,right=(int) 1e5;
		while(left<=right) {
			int mid=left+right >>>1;
			if(Check(mid,h,w,k)) left=mid+1;
			else {
				right=mid-1;
			}
		}
		System.out.println(left);
	}
	public static boolean Check(int mid,int h[],int w[],int k) {
		int ans=0;
		for(int i=0;i<h.length-1;i++) {
			ans+=(h[i]/mid)*(w[i]/mid);
		}
		return ans>=k;
	}

}
