package day04;

public class Rongyu {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程运行01");
            }
        }).start();
        new Thread(
                ()->{
                    System.out.println("线程运行02");
        }).start();
    }
}
