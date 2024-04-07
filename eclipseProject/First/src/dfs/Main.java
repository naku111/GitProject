package dfs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int[] f=new int[number+1];
		List<Integer> t =new ArrayList<Integer>();
		dfs(number, f,t);
	}
	public static void dfs(int n,int[] f,List<Integer> t) {
			if(t.size()==n)//每次递归的终止条件
				System.out.println(t);
			for(int i=1;i<=n;i++) {
				if(f[i]==1)	continue;
				f[i]=1;
				t.add(i);
				dfs(n, f, t);//递归入口
				t.remove(t.size()-1);
				f[i]=0;//退回
			}
	}
}
