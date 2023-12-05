package day02;

public class Interface_Test02 {
    public static void main(String[] args) {
        Interface_01 one=new Impclass_02();
        one.show("什么类型都可以");
        Interface_01<String> two=new Impclass_02();
        two.show("sdfsdf");
        Impclass_02<Integer> three=new Impclass_02<>();
        three.show(458);
    }
}
