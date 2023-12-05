package first_package.nimingneibulei;

public class Test02 {
    public static void main(String[] args) {
        //使用匿名内部类，同时使用匿名对象
        new My_interface(){
           public void show(){
               System.out.println("jshdkfjhsa");
           }
           public void show1(){
               System.out.println("shdfhsd");
           }
        }.show1();
    }
}
