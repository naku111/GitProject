package first_package.arraylist;
import java.util.ArrayList;

public class First_arraylist {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("klasjdfljsdlf");
        list.add("klasjdfljsdlf");
        list.add("klasjdfljsdlf");
        list.add("klasjdfljsdlf");

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        list.remove(2);

    }
}
