package day01;

public class Test_06 {
    public static void main(String[] args) {
        //有参构造函数
        Integer a=new Integer(1);
        System.out.println(a);
        Integer b=new Integer("1");
        System.out.println(b);
        //静态方法构造对象
        Integer c=Integer.valueOf(1);
        System.out.println(c);
        Integer d=Integer.valueOf("1");
        System.out.println(d);

    }
}
