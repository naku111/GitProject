package day02;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {
    public static void main(String[] args) {
        Collection<String> one=new ArrayList<>();
        one.add("aaa");
        one.add("bbb");
        one.add("ccc");
        java.util.Iterator<String> it=one.iterator();
        while (it.hasNext()){
            String a=it.next();
            System.out.println(a);
        }


    }
}
