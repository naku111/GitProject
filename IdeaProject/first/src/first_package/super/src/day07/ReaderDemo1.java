package day07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //转换流
        String FileName="F:\\IdeaProject\\first\\src\\first_package\\super\\src\\day07\\a.txt";

        InputStreamReader isr=new InputStreamReader(new FileInputStream(FileName));
        InputStreamReader isr2=new InputStreamReader(new FileInputStream(FileName),"GBK");//GBK为windows编码
        int read;

        // 使用默认编码字符流读取,乱码
        while ((read=isr.read())!=-1){
            System.out.println((char) read);
        }
        isr.close();

        // 使用指定编码字符流读取,正常解析
        while ((read=isr2.read())!=-1){
            System.out.println((char) read);
        }
        isr2.close();
    }
}
