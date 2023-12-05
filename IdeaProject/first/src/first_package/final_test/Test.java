package first_package.final_test;

public class Test {
    public static void main(String[] args) {

        Person p = new Person();

        Person.Heart heart = new Person().new Heart();

        heart.jump();

        p.setLive(false);

        p.show();
    }
}
