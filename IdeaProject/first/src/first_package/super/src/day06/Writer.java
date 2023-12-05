package day06;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
//        因为内置缓冲区的原因，如果不关闭输出字符流，无法写出字符到文件中。但是关闭的流对象，是无法继续写出数据
//        的。如果我们既想写出数据，又想继续使用流，就需要 flush 方法了。
//        不关闭则只写入缓冲区，需要刷新一下即可

        FileWriter fw = new FileWriter("fw.txt");
// 写出数据，通过flush
        fw.write('刷'); // 写出第1个字符
        fw.flush();
        fw.write('新'); // 继续写出第2个字符，写出成功
        fw.flush();
// 写出数据，通过close
        fw.write('关'); // 写出第1个字符
        fw.close();
//        fw.write('闭'); // 继续写出第2个字符,【报错】java.io.IOException: Stream closed
//        fw.close();
    }
}
