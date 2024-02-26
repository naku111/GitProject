package DiGui;


import java.util.LinkedList;

public class HanoiTower {
    //盘子有a、b、c，
    public static LinkedList<Integer> a=new LinkedList<>();
    public static LinkedList<Integer> b=new LinkedList<>();
    public static LinkedList<Integer> c=new LinkedList<>();
    public static void init(int n){
        for (int i = n; i>0; i--) {
            a.addLast(i);
        }
        print();
    }
    public static void print(){
        System.out.println("===========");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }
    public static void hanoi(int n,LinkedList<Integer> a,LinkedList<Integer> b,LinkedList<Integer> c){
        if (n==0)
            return;
        hanoi(n-1,a,c,b);
        c.addLast(a.removeLast());
        print();
        hanoi(n-1,b,a,c);
    }

    public static void main(String[] args) {
        init(4);
        hanoi(4,a,b,c);
    }
}
