package kuaisumi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
		//求幂的后三位数
		int b=mi(2,1000000000);
		System.out.println(b);
	}
	public static int mi(int dishu,int zhishu) {
		int result=1;
		while(zhishu > 0){
			if(zhishu%2==1){
				result=result*dishu%1000;
			}
			dishu=dishu*dishu%1000;
			zhishu=zhishu/2;
		}
		return result;
	}
}
