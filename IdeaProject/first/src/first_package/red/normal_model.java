package first_package.red;

import java.util.ArrayList;

public class normal_model implements OpenMode{
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list=new ArrayList<>();
        int avg=totalMoney/totalCount;
        int yushu=totalMoney%totalCount;
        for(int i=0;i<totalCount-1;i++)
        {
            list.add(avg);
        }
        list.add(avg+yushu);
        return list;
    }
}
