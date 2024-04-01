package demo01;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("转换字符串:");
		Scanner scanner=new Scanner(System.in);
		char[] one=scanner.next().toCharArray();
		StringBuilder s=new StringBuilder();
		for(int i=0;i<one.length;i++) {
			
			if(one[i]>='0'&&one[i]<='9') {
				int k=one[i]-'0';
				for(int j=0;j<k-1;j++) {
					s.append(one[i-1]);
				}
			}else {
				s.append(one[i]);
			}
			
		}
		System.out.println(s);
		scanner.close();
	}


}
