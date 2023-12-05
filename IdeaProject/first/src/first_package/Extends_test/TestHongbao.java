package first_package.Extends_test;

import java.util.ArrayList;

public class TestHongbao {
    public static void main(String[] args) {
        Qunzhu one=new Qunzhu("放羊屁",400);
        ArrayList<Integer> a=one.sendhongbao(200,10);
        Qunyuan numberone=new Qunyuan("1",0);
        Qunyuan numbertwo=new Qunyuan("2",10);
        Qunyuan numberthree=new Qunyuan("3",20);
        numberone.qianghongbao(a);
        numbertwo.qianghongbao(a);
        numberthree.qianghongbao(a);
        one.show();
        numberone.show();
        numbertwo.show();
        numberthree.show();
        System.out.println("红包还有"+a.size()+"个");
    }
}
