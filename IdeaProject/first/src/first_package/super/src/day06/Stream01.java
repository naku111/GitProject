package day06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream01 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("D:\\a.txt");
        } catch (FileNotFoundException e) {

        }
        byte[] a={12,97,98,99};
        try {
            fileOutputStream.write(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
