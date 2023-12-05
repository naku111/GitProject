package day04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunnable_Test {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(2);
        MyRunnable myRunnable = new MyRunnable();
        service.submit(myRunnable);
        service.submit(myRunnable);
        service.submit(myRunnable);
    }
}
