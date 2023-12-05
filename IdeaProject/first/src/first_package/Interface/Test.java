package first_package.Interface;

public class Test {
    public static void main(String[] args) {
        First_interface one=new Imp_class();
        Imp_class two=new Imp_class();
        wan(new Imp_class());
        one.show();
        one.show1();
        First_interface.show2();
        wan(one);
        wan(two);
    }
    public static void wan(First_interface a){
    a.show();
    }
}

