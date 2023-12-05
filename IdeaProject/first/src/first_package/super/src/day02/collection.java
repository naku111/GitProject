package day02;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String[] args) {
        Collection<Integer> coll=new ArrayList<>();
        coll.add(10);
        coll.add(0);
        coll.add(20);
        coll.add(30);
        boolean remove = coll.remove(10);
        System.out.println(remove);
        Object[] a=coll.toArray();
        for (Object i:a) {
            System.out.println(i);
        }

    }
}
