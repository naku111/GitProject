package day01;

public class Test_07 {
    public static void main(String[] args) {
        //基本类型->字符串
        String s=100+"";
        System.out.println(s+400);

        String s1 = Integer.toString(100);
        System.out.println(s1+400);

        String s2 = String.valueOf(100);
        System.out.println(s2+400 );

        //字符串->基本类型
        int i=Integer.parseInt("100");
        System.out.println(i);
    }
}
