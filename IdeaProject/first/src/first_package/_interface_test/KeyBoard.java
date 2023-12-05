package first_package._interface_test;

public class KeyBoard implements USB{
    public void open() {
        System.out.println("键盘开启，绿灯闪一闪");
    }
    public void close() {
        System.out.println("键盘关闭，绿灯熄灭");
    }
    public void type(){
        System.out.println("键盘打字");
    }
}
