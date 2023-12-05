package day04;

public class Baozipu implements Runnable{
    Baozi baozi;

    public Baozipu(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        zuo();
    }

    public void zuo() {
        int count=0;
        while (true){
            synchronized (baozi){
                if (baozi.flag==true){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("包子铺开始做包子");
                baozi.pi="薄皮";
                baozi.xian="肉馅";
                count++;
                baozi.flag=true;
                System.out.println("可以吃包子了！");
                baozi.notify();
            }
        }
    }
}
