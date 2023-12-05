package day05;

import java.io.File;

public class DiGuiFile01 {
    public static void main(String[] args) {
        File dir = new File("D:\\aaa");
        printDir(dir);
    }
    //递归遍历所有子目录
    public static void printDir(File dir) {

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
    // 是文件,输出文件绝对路径
                System.out.println("文件名:"+ file.getAbsolutePath());
            } else {
    // 是目录,输出目录绝对路径
                System.out.println("目录:"+file.getAbsolutePath());
                printDir(file);
            }
        }
    }

}
