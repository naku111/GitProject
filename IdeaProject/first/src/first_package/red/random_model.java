package first_package.red;

import java.util.ArrayList;
import java.util.Random;

public class random_model implements OpenMode{
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list=new ArrayList<>();
        Random random=new Random();
        int leftMoney=totalMoney;
        int leftCount=totalCount;
        for (int i=0;i<totalCount-1;i++){
            int money=random.nextInt(leftMoney/leftCount*2)+1;
            list.add(money);
            leftMoney-=money;
            leftCount--;
        }
        return list;
    }
}
