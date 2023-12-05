package day06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\read.txt");
        int length;
        char[] cbuf=new char[2];
        while ((length=fileReader.read(cbuf))!=-1){
            System.out.println(new String(cbuf));
        }
        fileReader.close();
    }
}
