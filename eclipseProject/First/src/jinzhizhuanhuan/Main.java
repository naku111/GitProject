package jinzhizhuanhuan;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		//调用api
		String str=Integer.toString(number,16);
		System.out.println(str);
		//
		String st=zhuanhuan_1(number, 16);
		System.out.println(st);
		
		int a=zhuanhuan_2(16,"7B");
		System.out.println(a);
	}

	public static String zhuanhuan_1(int number,int jinzhi) {
		//十进制转别的
		StringBuilder stringBuilder=new StringBuilder();
		while(number>0){
			int k=number%jinzhi;
			if(k>=10) {
				stringBuilder.append((char) (k-10+'a'));
			}
			else {
				stringBuilder.append(k);
			}
				
			number/=jinzhi;
		}
		return stringBuilder.reverse().toString();
	}
	
	public static int zhuanhuan_2(int jinzhi,String str) {
		
		//别的转换十进制
		char[] ch=str.toCharArray();
		int sum=0;
		int k;
		int c=1;
		for(int i=ch.length-1;i>=0;i--) {
			
			if(ch[i]>='A'&&ch[i]<='F') {
				k=ch[i]-'A'+10;
			}
			else {
				k=ch[i]-'0';
			}
			sum+=k*c;
			c=c*jinzhi;
		}
		return sum;
	}
}
