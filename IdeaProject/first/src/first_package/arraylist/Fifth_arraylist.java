package first_package.arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//筛选偶数元素
public class Fifth_arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> a=new ArrayList<>();
        System.out.println("请输入一个整数：");
        int sum=new Scanner(System.in).nextInt();
        for(int i=0;i<sum;i++)
        {
            int b=new Random().nextInt(50)+1;
            a.add(b);
        }
        System.out.println(a);
        ArrayList<Integer> last=tiaoxuan(a);
        System.out.println(last);
    }
    public static ArrayList<Integer> tiaoxuan(ArrayList<Integer> l)
    {
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0;i<l.size();i++)
        {
            int temp=l.get(i);
            if((l.get(i))%2==0)
            {
                numbers.add(temp);
            }

        }
        return numbers;
    }
}
