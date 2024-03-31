package demo06;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("按照顺序输出数字");
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		char[] ch=scan.next().toCharArray();
		for(int i=0;i<3;i++) {
			System.out.print(arr[ch[i]-'A']+" ");
		}

	}

}
