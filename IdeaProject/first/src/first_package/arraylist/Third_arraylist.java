package first_package.arraylist;

import java.util.ArrayList;

public class Third_arraylist {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        Student student1=new Student("wang",20);
        Student student2=new Student("ang",20);
        Student student3=new Student("yang",20);
        Student student4=new Student("liang",20);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student1);
        for(int i=0;i<students.size();i++)
        {
            System.out.println("名字为："+students.get(i).getName()+",年龄为："+students.get(i).getAge());
        }
    }

}
