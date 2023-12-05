package first_package.nimingneibulei;

public class Test01 {
    public static void main(String[] args) {
        //省略实现类，创建对象
        My_interface obj=new My_interface() {
            @Override
            public void show() {
                System.out.println("匿名内部类实现了方法！");
            }
        };
        obj.show();
    }
}
