package first_package.Random;
import java.util.Random;
import java.util.Scanner;
//猜数字游戏
public class First_Random {
    public static void main(String[] args) {
        int number=new Random().nextInt(10)+1;
        while(true){
            System.out.println("请输入一个整数：");
            int guessnumber=new Scanner(System.in).nextInt();
            if(guessnumber>number)
                System.out.println("大了");
            else if(guessnumber<number)
                System.out.println("小了");
            else
                break;
        }

    }
}
