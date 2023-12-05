package day03;

public class Demo01Runnable_test {
    public static void main(String[] args) {
        Demo01Runnable demo01Runnable = new Demo01Runnable();
        Thread t=new Thread(demo01Runnable);
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
