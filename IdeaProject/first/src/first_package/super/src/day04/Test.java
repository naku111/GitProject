package day04;

public class Test {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();
        new Thread(new Baozipu(baozi)).start();
        new Thread(new Chibaozi(baozi)).start();
    }
}
