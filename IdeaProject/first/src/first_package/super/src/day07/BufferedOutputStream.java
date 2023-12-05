package day07;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("F:\\IdeaProject\\first\\src\\first_package\\super\\src\\day07\\a.txt");
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write("今天是11.27".getBytes());
        bufferedOutputStream.close();
    }
}
