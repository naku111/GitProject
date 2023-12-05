package day03;

public class MyThread02 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
