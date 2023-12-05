package first_package.basic_class;

public class Test01 {
    public static void main(String[] args) {
        Person person1=new Person("anfdf",20);
        person1.show();
        person1.setAge(50);
        person1.setName("赵丽颖");
        System.out.println(person1.getName()+"    "+person1.getAge());
        person1.show();
        String name1=new String("jhsdjhfksd");
        System.out.println(name1);
    }
}
