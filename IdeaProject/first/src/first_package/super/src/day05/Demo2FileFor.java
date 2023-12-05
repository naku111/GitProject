package day05;

import java.io.File;

public class Demo2FileFor {
    public static void main(String[] args) {
        File file1 = new File("D:\\java_code");

        //获取当前目录下的文件以及文件夹的名称。
        String[] names=file1.list();
        for (String name: names) {
            System.out.println(name);
        }
        System.out.println("==========");
        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
        //调用listFiles方法的File对象，表示的必须是实际存在的目录，否则返回null，无法进行遍历。
        File[] files=file1.listFiles();
        for (File file: files) {
            System.out.println(file);
        }
    }
}
