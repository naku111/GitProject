package demo04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("数对：");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int c=scan.nextInt();
		int[] arr=new int[n];
		
		Map<Integer,Integer> s=new HashMap<>();
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
			s.put(arr[i],s.getOrDefault(arr[i], 0)+1);
		}
		int res=0;
		for(int i=0;i<n;i++) {
			int b=arr[i]-c;
			res+=s.getOrDefault(b,0);
		}
		System.out.println(res);
	}
}
