package day01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test_04 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        long time=date.getTime();

        System.out.println(time);

        System.out.println("请输入生日：");

        String birthday=new Scanner(System.in).next();
        DateFormat df1=new SimpleDateFormat("yyyy年MM月dd日");
        Date date1=df1.parse(birthday);
        long time1=date1.getTime();

        String format = df1.format(date);
        System.out.println(format);
        System.out.println(time1);

        long a=time-time1;
        System.out.println(a);

        Date three=new Date(a);
        System.out.println(three);//Sun Mar 16 09:31:04 CST 1975
    }
}
