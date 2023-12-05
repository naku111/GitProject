package day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriterDemo1 {
    public static void main(String[] args) throws IOException {
        String FileName = "F:\\IdeaProject\\first\\src\\first_package\\super\\src\\day07\\shuchu.txt";
// 创建流对象,默认UTF8编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(FileName));
// 写出数据
        osw.write("你好"); // 保存为6个字节
        osw.close();
// 定义文件路径
        String FileName2 = "F:\\IdeaProject\\first\\src\\first_package\\super\\src\\day07\\shuchu2.txt";
// 创建流对象,指定GBK编码
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream(FileName2),"GBK");
// 写出数据
        osw2.write("你好");// 保存为4个字节
        osw2.close();

    }
}
