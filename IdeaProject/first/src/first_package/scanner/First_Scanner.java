package first_package.scanner;
import java.util.Scanner;

public class First_Scanner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个数字：");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int temp=Math.max(num1,num2);
        int max=Math.max(temp,num3);
        System.out.println(max);
    }

}
