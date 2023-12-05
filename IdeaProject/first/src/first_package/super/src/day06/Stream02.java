package day06;

import java.io.FileOutputStream;
import java.io.IOException;

public class Stream02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\a.txt", true);
        byte[] words = {97,98,99,100,101};
// 遍历数组
        for (int i = 0; i < words.length; i++) {
// 写出一个字节
            fileOutputStream.write(words[i]);
// 写出一个换行, 换行符号转成数组写出
            fileOutputStream.write("\r\n".getBytes());
        }
// 关闭资源
        fileOutputStream.close();

    }
}
