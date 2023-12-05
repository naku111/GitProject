package day01;

import java.util.Date;

public class Test_02 {
    public static void main(String[] args) {
        demo();
        demo1();
        demo2();
    }
    public static void demo(){
        Date one=new Date();
        System.out.println(one);//Wed Oct 25 16:56:44 CST 2023
    }
    public static void demo1(){
        Date two=new Date(0l);
        System.out.println(two);//Thu Jan 01 08:00:00 CST 1970
        Date three=new Date(164165464698l);
        System.out.println(three);//Sun Mar 16 09:31:04 CST 1975
    }
    public static void demo2(){
        Date four=new Date();
        long time=four.getTime();
        System.out.println(time);//1698224328509
    }
}
