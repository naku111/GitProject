package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("F:\\IdeaProject\\first\\src\\first_package\\super\\src\\day07\\a.txt");
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(fileInputStream);
        int len=0;
        while ((len=bufferedInputStream.read())!=-1){
            System.out.println(len);
        }
        bufferedInputStream.close();
    }
}
