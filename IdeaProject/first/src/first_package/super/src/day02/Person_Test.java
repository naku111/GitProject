package day02;

import day01.Person;

public class Person_Test {
    public static void main(String[] args) {
        People one=new People();
        one.setName("默认为object");
        Object name = one.getName();
        System.out.println(name);

        People<Integer> two=new People<>();
        two.setName(23);
        Integer name1 = two.getName();
        System.out.println(name1);

        People<String> three=new People<>();
        three.setName("wang");
        String name2 = three.getName();
        System.out.println(name2);
    }
}
