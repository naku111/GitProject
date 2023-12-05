package day01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_03 {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日");
        String str=df.format(date);
        System.out.println(str);//2023年10月25日
        String str1="2000年10月10日";
        DateFormat df1=new SimpleDateFormat("yyyy年MM月dd日");
        Date date1=df1.parse(str1);
        System.out.println(date1);//Tue Oct 10 00:00:00 CST 2000
    }
}
