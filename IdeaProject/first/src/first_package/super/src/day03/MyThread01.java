package day03;

public class MyThread01 extends Thread{
    public MyThread01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("执行"+(i+1)+"次");
        }
    }
}
