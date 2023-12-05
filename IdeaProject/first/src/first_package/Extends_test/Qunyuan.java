package first_package.Extends_test;

import java.util.ArrayList;
import java.util.Random;

public class Qunyuan extends User{
    Qunyuan(){}
    Qunyuan(String name,int money)
    {
        super(name,money);
    }
    public void qianghongbao(ArrayList<Integer> hongbao){
        System.out.println(super.getName()+"   抢红包啦！");
        int number=new Random().nextInt(hongbao.size());
        int b=getMoney()+hongbao.get(number);
        hongbao.remove(number);
        setMoney(b);
    }


}
