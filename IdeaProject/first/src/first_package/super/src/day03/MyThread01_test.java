package day03;

public class MyThread01_test {
    public static void main(String[] args) {
        MyThread01 myThread = new MyThread01("新的线程！");
        myThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程！"+i);
        }
    }
}
