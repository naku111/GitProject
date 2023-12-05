package first_package.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Second_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<6;i++)
        {
            int b=new Random().nextInt(33)+1;
            a.add(b);
        }
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
    }
}
