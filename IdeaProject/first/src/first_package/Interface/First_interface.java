package first_package.Interface;

public interface First_interface {
    void show();
    default void show1()
    {
        System.out.println("第一个默认方法！");
        show3();
        show2();
    }
    static void show2()
    {
        System.out.println("第一个静态方法！");
        show3();
    }
    private static void show3()
    {
        System.out.println("第一个私有方法！");
    }


}
