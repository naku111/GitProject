package first_package.scanner;
import java.util.Scanner;

public class Second_Scanner {
    public static void main(String[] args) {

        System.out.println("请输入三个数字：");
        int num1=new Scanner(System.in).nextInt();//匿名对象创建
        int num2=new Scanner(System.in).nextInt();
        int num3=new Scanner(System.in).nextInt();
        int temp=Math.max(num1,num2);
        int max=Math.max(temp,num3);
        System.out.println(max);
    }

}
