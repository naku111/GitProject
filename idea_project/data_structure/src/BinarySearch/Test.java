package BinarySearch;



public class Test {
    public static void main(String[] args) {
        int[] b={2,6,34,56,78,100};
        int a=BinarySearch_01.BinarySearchBasic(b,2);
        int c=BinarySearch_01.BinarySearchBasic(b,68);
        System.out.println(a);
        System.out.println(c);
        System.out.println("=============");
        a=BinarySearch_02.BinarySearchBasic(b,2);
        c=BinarySearch_02.BinarySearchBasic(b,68);
        System.out.println(a);
        System.out.println(c);
        System.out.println("=============");
        a=BinarySearchLeftmost01.BinarySearchBasic(b,2);
        c=BinarySearchLeftmost01.BinarySearchBasic(b,68);
        System.out.println(a);
        System.out.println(c);
        System.out.println("=============");
        a=BinarySearchLeftmost02.BinarySearchBasic(b,2);
        c=BinarySearchLeftmost02.BinarySearchBasic(b,68);
        System.out.println(a);
        System.out.println(c);
        System.out.println("=============");
        a=BinarySearchRightmost01.BinarySearchBasic(b,2);
        c=BinarySearchRightmost01.BinarySearchBasic(b,68);
        System.out.println(a);
        System.out.println(c);
        System.out.println("=============");
        a=BinarySearchRightmost02.BinarySearchBasic(b,2);
        c=BinarySearchRightmost02.BinarySearchBasic(b,68);
        System.out.println(a);
        System.out.println(c);
        System.out.println("=============");
        a=BinarySearchBalance.BinarySearchBasic(b,2);
        c=BinarySearchBalance.BinarySearchBasic(b,68);
        System.out.println(a);
        System.out.println(c);
    }
}
