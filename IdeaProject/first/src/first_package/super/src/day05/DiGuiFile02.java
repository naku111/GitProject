package day05;

import java.io.File;
import java.io.FileFilter;

public class DiGuiFile02 {
    public static void main(String[] args) {
        File dir = new File("D:\\aaa");
        printDir2(dir);
    }
    public static void printDir2(File dir) {

//        accept 方法，参数为File，表示当前File下所有的子文件和子目录。保留住则返回true，过滤掉则返回
//        false。保留规则：
//        1. 要么是.java文件。
//        2. 要么是目录，用于继续遍历。
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });
// 循环打印
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名:" + file.getAbsolutePath());
            } else {
                printDir2(file);
            }
        }
    }

}
