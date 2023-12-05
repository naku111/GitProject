package day01;

import java.util.Objects;

public class Person{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setName(String 默认为object) {
    }
}


