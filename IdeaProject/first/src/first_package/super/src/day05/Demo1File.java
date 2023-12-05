package day05;

import java.io.File;

public class Demo1File {
    public static void main(String[] args) {
        String pathname="E:\\重邮802";
        String parent="E:";
        String child="重邮802";
        //三种构造方法
//        public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
//        public File(String parent, String child) ：从父路径名字符串和子路径名字符串创建新的 File实例。
//        public File(File parent, String child) ：从父抽象路径名和子路径名字符串创建新的 File实例。

        File file1 = new File(pathname);
        File file2 = new File(parent, child);

        File file3 = new File(parent);
        File file4 = new File(file3, child);

        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file4);

        System.out.println("==========");
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.length());
        System.out.println("==========");
        //相对路径：相对于项目目录的路径，只是一个更便捷的路径，开发中经常使用
        File file5 = new File("bbb.java");
        System.out.println(file5.getAbsolutePath());

        System.out.println("==========");
        //三个判断的方法
//        public boolean exists() ：此File表示的文件或目录是否实际存在。
//        public boolean isDirectory() ：此File表示的是否为目录。
//        public boolean isFile() ：此File表示的是否为文件。
        System.out.println("是否存在？："+file5.exists());
        System.out.println("是文件吗？："+file5.isFile());
        System.out.println("是文件夹吗？："+file5.isDirectory());


    }
}
