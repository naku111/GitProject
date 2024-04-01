package demo03;



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		System.out.println("去重输出:");
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			
			Set<Integer> s=new HashSet<>();
			
			int k=scan.nextInt();
			for(int j=0;j<k;j++) {
				int a=scan.nextInt();
				if(s.contains(a))
					continue;
				System.out.print(a+" ");
			}
			
			System.out.println();
		}
	}

}
