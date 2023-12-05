package day04;

public class Chibaozi implements Runnable{
    Baozi baozi;

    public Chibaozi(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        chi();
    }

    public void chi() {
        while (true){
            synchronized (baozi){
                if(baozi.flag==false){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("吃货正在吃"+baozi.pi+baozi.xian+"包子");
                baozi.flag = false;
                baozi.notify();
            }
        }
    }
}
