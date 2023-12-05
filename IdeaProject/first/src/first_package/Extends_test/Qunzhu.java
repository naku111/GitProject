package first_package.Extends_test;
import java.util.ArrayList;
public class Qunzhu extends User{
    Qunzhu(){}
    Qunzhu(String name,int money)
    {
        super(name,money);
    }
    public ArrayList<Integer> sendhongbao(int fenmoney,int count)
    {
        if(fenmoney>super.getMoney())
        {
            return null;
        }
        else {
            int yue=getMoney()-fenmoney;
            setMoney(yue);
            ArrayList<Integer> hongbaozu=new ArrayList<>();
            for(int i=0;i<count;i++)
            {
                Integer a=fenmoney/count;
                hongbaozu.add(a);
            }
            return hongbaozu;
        }
    }
}
